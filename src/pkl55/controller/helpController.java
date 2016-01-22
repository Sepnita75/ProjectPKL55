/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.controller;

import pkl55.helpPanelComponent.aHelpCard;
//import help.controller.CardController;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author nurilmi
 */
public class helpController {
    aHelpCard ahelpcard;
    CardLayoutController controller;
    

    public helpController(aHelpCard j){
        this.ahelpcard = j;
        controller = new CardLayoutController();
        controller.setCardLayout((CardLayout)j.getMainPanel().getLayout());
        controller.setParentCard(j.getMainPanel());
        
    ahelpcard.getMainHelpPanel1().getPetunjukBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("petunjuk");
            }
        });
    
    ahelpcard.getPetunjukPanel1().getMemulaiProgramBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("memulaiProgram");
            }
        });
    
    ahelpcard.getMemulaiProgramPanel1().getBackBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("petunjuk");
            }
        });
    
    ahelpcard.getPetunjukPanel1().getEntriDSBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("EntriDSIsi");
            }
        });
    
    ahelpcard.getEntriDSPanel1().getBackBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("petunjuk");
            }
        });
    
    ahelpcard.getPetunjukPanel1().getEntriCacahBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("entriKuesCacah");
            }
        });
    
    ahelpcard.getEntriCacahPanel1().getBackBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("petunjuk");
            }
        });
    
    ahelpcard.getPetunjukPanel1().getUpdatingKuesCacahBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("updatingKues");
            }
        });
    
    ahelpcard.getUpdatingCacahPanel1().getBackBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("petunjuk");
            }
        });
    
    ahelpcard.getPetunjukPanel1().getMengakhiriProgramBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("mengakhiriProgram");
            }
        });
    
    ahelpcard.getMengakhiriProgramPanel1().getBackBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("petunjuk");
            }
        });
    
    ahelpcard.getPetunjukPanel1().getBackBt2().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("mainHelp");
            }
        });
    
    ahelpcard.getMainHelpPanel1().getRuleValidasiBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("ruleValidasi");
            }
        });
    
    ahelpcard.getRuleValidasiPanel1().getKuesCacahBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("kuesCacah");
            }
        });
    
    ahelpcard.getKuesCacahPanel1().getBackBt1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                controller.show("ruleValidasi");
            }
    });
    
    ahelpcard.getRuleValidasiPanel1().getKuesDSBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               controller.show("kuesDS");
            }
        });
    
    ahelpcard.getKuesDSPanel1().getBackBt1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                controller.show("ruleValidasi");
            }
    });
    
    ahelpcard.getRuleValidasiPanel1().getBackBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("mainHelp");
            }
        });
    
    ahelpcard.getMainHelpPanel1().getPerlakuanErrorBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("perlakuanError");
            }
        });
    
    ahelpcard.getPerlakuanErrorPanel1().getMissingValueBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("missingValue");
            }
        });
    
    ahelpcard.getMissingValuePanel1().getBackBt1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                controller.show("perlakuanError");
            }
    });
    
    ahelpcard.getPerlakuanErrorPanel1().getErrorPenyimpananBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("errorPenyimpanan");
            }
        });
    
    ahelpcard.getErrorPenyimpananPanel1().getBackBt1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                controller.show("perlakuanError");
            }
    });
    
    ahelpcard.getPerlakuanErrorPanel1().getErrorKuesBt1().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.show("errorKues");
            }
        });
    
    ahelpcard.getErrorKuesPanel1().getBackBt1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                controller.show("errorKues");
            }
    });
    
    ahelpcard.getPerlakuanErrorPanel1().getBackBt1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                controller.show("mainHelp");
            }
    });
    }
  
}

