package pkl55.data.view;

import pkl55.data.controller.Loop;
import pkl55.data.controller.TextSelect;
import pkl55.data.controller.Variabel;
import pkl55.data.controller.VariabelMap;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import pkl55.data.model.Config;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class TextFieldLoop extends Field {

    private String loopName;
    private boolean start;
    private boolean end;
    private TabelLoop tabelLoop = null;
    private ArrayList<String> values = null;

    public TextFieldLoop() {
        super();
        start = false;
        end = false;
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (Config.automove) {
                    Variabel ts = VariabelMap.getVar(varName);
                    if (ts instanceof TextSelect) {
                        if (getText().length() == ((TextSelect) ts).getLength()) {
                            if (!isEnd()) {
                                if (View.pos + 1 < View.getLength()) {
                                    View.pos++;
                                    View.get(View.pos).requestFocus();
                                }
                            } else {
                                values = new ArrayList();
                                int pos = View.pos;
                                values.add(View.get(pos).getText());
                                VariabelMap.set(varName, getText());
                                while (!((TextFieldLoop) View.get(pos)).isStart()) {
                                    pos--;
                                    values.add(View.get(pos).getText());
                                    View.get(pos).setText("");

                                }
                                View.pos = pos;
                                if (tabelLoop != null) {
                                    Collections.reverse(values);
                                    System.out.print("In table loop\n\t");
                                    for (String s : values.toArray(new String[values.size()])) {
                                        System.out.print(s + "\t");
                                    }
                                    tabelLoop.insert(values.toArray(new String[values.size()]));
                                }
                                VariabelMap.getLoop(loopName).next();
                                View.get(View.pos).requestFocus();
                            }
                        }
                    }
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }
        });
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                View.pos = position;
                try {
                    Variabel var = VariabelMap.getVar(varName);
                    if (var != null) {
                        if (var.isEnable()) {
                            setColor(FieldColor.ON_INPUT);
                        } else {
                            setColor(FieldColor.ON_DISABLE);
                        }
                    }
                } catch (Exception e) {
                }
                focusFollow(fe);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (isEnd()) {
                    setText("");
                } else {
                    VariabelMap.set(varName, getText());
                    Variabel var = VariabelMap.getVar(varName);
                    Loop loop = VariabelMap.getLoop(loopName);
                    System.out.println((errorlist == null) + "\t" +loop.getActive());
                    if (var != null) {
                        if (!var.isValid()) {
                            errorlist.add(new ListItemLoop(VariabelMap.getVar(varName).getMessage(), varName, loop.getActive()));
                            setColor(FieldColor.ON_ERROR);
                        } else {
                            try {
                                errorlist.remove(varName + " ke " + (loop.getActive() + 1));
                                setColor(FieldColor.ON_NORMAL);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }

        });
        this.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("apakah\t" + tabelLoop);
                if (!isEnd()) {
                    if (View.pos + 1 < View.getLength()) {
                        View.pos++;
                        View.get(View.pos).requestFocus();
                    }
                } else {
                    values = new ArrayList();
                    int pos = View.pos;
                    values.add(View.get(pos).getText());
                    VariabelMap.set(varName, getText());
                    Variabel var = VariabelMap.getVar(varName);
                    Loop loop = VariabelMap.getLoop(loopName);
                    if (var != null) {
                        if (!var.isValid()) {
                            errorlist.add(new ListItem(VariabelMap.getVar(varName).getMessage(), varName + " ke " + (loop.getActive() + 1)));
                            setColor(FieldColor.ON_ERROR);
                        } else {
                            try {
                                errorlist.remove(varName, loop.getActive());
                                setColor(FieldColor.ON_NORMAL);
                            } catch (Exception err) {
                            }
                        }
                    }
                    short page_back = 0;
                    Hal pointer_panel = getPanel();
                    while (!((TextFieldLoop) View.get(pos)).isStart()) {
                        pos--;
                        values.add(View.get(pos).getText());
                        View.get(pos).setText("");
                        if (View.get(pos).getPanel() != pointer_panel) {
                            page_back++;
                            pointer_panel = View.get(pos).getPanel();
                        }
                    }
                    View.pos = pos;
                    if (tabelLoop != null) {
                        Collections.reverse(values);
                        System.out.println(values.size());
                        tabelLoop.insert(values.toArray(new String[values.size()]));
                    }
                    VariabelMap.getLoop(loopName).next();
                    System.out.println("");
                    for (int i = 0; i < page_back; i++) {
                        getPanel().back();
                    }
                    View.get(View.pos).requestFocus();

                    //tes
                    Hashtable<String, ArrayList<String>> l = VariabelMap.getLoop(loopName).getAllVariabels();
                    ArrayList<String>[] varL = l.values().toArray(new ArrayList[l.size()]);
                    for (int i = 0; i < varL[0].size(); i++) {
                        System.out.print("OUTPUT :\t");
                        for (int j = 0; j < varL.length; j++) {
                            System.out.print(varL[j].get(i) + "\t");
                        }
                        System.out.println("");
                    }
                    System.out.println("OK");
                    //endtes
                }
            }
        });
    }

    private void focusFollow(java.awt.event.FocusEvent evt) {
        java.awt.Component focusedComponent = evt.getComponent();
        if (panel != null) {
            panel.scrollRectToVisible(focusedComponent.getBounds(null));
            repaint();
        } else {
            System.out.println("Panelnya belon di set coy");
        }
    }

    private void setColor(Color c) {
        setBackground(c);
    }

    public void warning() {
        setBackground(FieldColor.ON_WARNING);
    }

    public void error() {
        setBackground(FieldColor.ON_ERROR);
    }

    public void empty() {
        setText("");
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getValue() {
        return getText();
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public String getLoopName() {
        return loopName;
    }

    public void setLoopName(String loopName) {
        this.loopName = loopName;
    }

    public void setTabelLoop(TabelLoop tabelLoop) {
        this.tabelLoop = tabelLoop;
        System.out.println("Setted\t" + this.tabelLoop);
    }

}
