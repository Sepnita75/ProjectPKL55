
package pkl55.data.view;

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

/**
 *
 * @author faqih_
 */
public class TextField extends Field {


    public TextField() {
        super();
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (Config.automove) {
                    Variabel ts = VariabelMap.getVar(getVarName());
                    if (ts instanceof TextSelect) {
                        if (getText().length() == ((TextSelect) ts).getLength()) {
                            if (View.pos + 1 < View.getLength()) {
                                try {
                                    if (nextpage) {
                                        panel.next();
                                    }
                                    View.pos++;
                                    View.get(View.pos).requestFocus();
                                } catch (Exception er) {
                                }
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
                    Variabel var = VariabelMap.getVar(getVarName());
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
                System.out.println(errorlist);
                VariabelMap.set(getVarName(), getText());
                Variabel var = VariabelMap.getVar(getVarName());
                if (var != null) {
                    if (!var.isValid()) {
                        errorlist.add(new ListItem(VariabelMap.getVar(getVarName()).getMessage(), getVarName()));
                        setColor(FieldColor.ON_ERROR);
                    } else {
                        try {
                            errorlist.remove(getVarName());
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
                if ((View.pos + 1) < View.getLength()) {
                    try {
                        if (nextpage) {
                            panel.next();
                        }
                        View.pos++;
                        View.get(View.pos).requestFocus();
                    } catch (Exception ex) {
                    }
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

    public void setVarName(String var) {
        varName = var;
    }

    public String getValue() {
        return getText();
    }

}
