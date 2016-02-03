
package View;

import Controller.Loop;
import Controller.TextSelect;
import Controller.Variabel;
import Controller.VariabelMap;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import Model.Config;
import java.util.ArrayList;

/**
 *
 * @author faqih_
 */
public class TextFieldLoop extends Field {

    private String varName;
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
                                if (position + 1 < View.getLength()) {
                                    View.get(position + 1).requestFocus();
                                }
                            } else {
                                values = new ArrayList();
                                int pos = position;
                                values.add(View.get(pos).getText());
                                while (!((TextFieldLoop) View.get(pos)).isStart()) {
                                    pos--;
                                    values.add(View.get(pos).getText());
                                }
                                position = pos;
                                if (tabelLoop != null) {
                                    tabelLoop.insert(values.toArray(new String[values.size()]));
                                }
                                VariabelMap.getLoop(loopName).next();
                                View.get(position).requestFocus();
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
                try {
                    Variabel var = VariabelMap.getVar(varName);
                    if (var != null) {
                        if (var.isEnable()) {
                            setColor(FieldColor.ON_DISABLE);
                        } else {
                            setColor(FieldColor.ON_INPUT);
                        }
                    }
                } catch (Exception e) {
                }
                focusFollow(fe);
            }

            @Override
            public void focusLost(FocusEvent fe) {
                System.out.println("Hellooooo\t"+getText());
                VariabelMap.set(varName, getText());
                Variabel var = VariabelMap.getVar(varName);
                Loop loop = VariabelMap.getLoop(loopName);
                if (var != null) {
                    if (!var.isValid()) {
                        errorlist.add(new ListItem(VariabelMap.getVar(varName).getMessage(), varName + " ke " + loop.getActive()));
                        setColor(FieldColor.ON_ERROR);
                    } else {
                        try {
                            errorlist.remove(varName + " ke " + loop.getActive());
                            setColor(FieldColor.ON_NORMAL);
                        } catch (Exception e) {
                        }
                    }
                }
            }

        });
        this.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isEnd()) {
                    if (position + 1 < View.getLength()) {
                        View.get(position + 1).requestFocus();
                    }
                } else {
                    values = new ArrayList();
                    int pos = position;
                    values.add(View.get(pos).getText());
                    while (!((TextFieldLoop) View.get(pos)).isStart()) {
                        pos--;
                        values.add(View.get(pos).getText());
                    }
                    position = pos;
                    if (tabelLoop != null) {
                        tabelLoop.insert(values.toArray(new String[values.size()]));
                    }
                    VariabelMap.getLoop(loopName).next();
                    View.get(position).requestFocus();
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
    }

}
