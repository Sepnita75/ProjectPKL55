/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner.validasi;

import pkl55.data.controller.Blok;
import pkl55.data.controller.IntNumber;
import pkl55.data.controller.MessageString;
import pkl55.data.controller.NumberSelect;
import pkl55.data.controller.SuperVariabel;
import pkl55.data.controller.Text;
import java.util.Hashtable;
import pkl55.data.controller.Controller;

/**
 *
 * @author REYHAN
 */
public class ValidasiUU {
    

    public static void kuesioner() {
        Hashtable<String, Blok> k1 = new Hashtable();
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 1 |---------------------------------------
//----------------------------------------------------------------------------------------        
          Hashtable<String, SuperVariabel> b1 = new Hashtable();
        
        b1.put("b1r1", new IntNumber() {
           
            @Override
            public void valid() {
                
                value = 52;
                setRequire(true);  
                if(value!=52) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
            
        });
        
        b1.put("b1r2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                if(value!=1 && value!=8) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

            }           
            
        });
        
        b1.put("b1r3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(999);
                setRequire(true);

            }
            
        });

        b1.put("b1r4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(999);
                setRequire(true);

            }
            
        });

        b1.put("b1r5", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                setRequire(true);
                if(value!=1 && value!=2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

            }
            
        });

        b1.put("b1r6", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(9999);
                setRequire(true);
                
            }
            
        });

        b1.put("b1r7", new IntNumber() {
           
            @Override
            public void valid() {
                setMin(1);
                setMax(99);
                setRequire(true);
                
            }
        });


        b1.put("b1r8", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
            
        });

        b1.put("b1r9s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(99999);
                setRequire(true);
                
            }
            
        });

        b1.put("b1r9s2", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
            
        });


        b1.put("b1r9s3", new Text() {
           
            @Override
            public void valid() {
                   
            }
        });

        b1.put("b1r9s4", new Text() {
           
            @Override
            public void valid() {
                   
            }
        });

        b1.put("b1r9s5", new Text() {
           
            @Override
            public void valid() {
                       
            }
        });

        b1.put("b1r10", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                setRequire(true);
               
            }
        });
        
        Blok blok1 = new Blok(b1);
        k1.put("b1", blok1);


//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 2 |---------------------------------------
//----------------------------------------------------------------------------------------        
        
        Hashtable<String, SuperVariabel> b2 = new Hashtable();
        
        b2.put("b2r1s1", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
               
            }
        }); 

        b2.put("b2r1s2", new Text() {
           
            @Override
            public void valid() {
                setRequire(true);
               
            }
        }); 

        b2.put("b2r2s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
            
            }
        }); 

        b2.put("b2r2s2", new IntNumber() {
           
            @Override
            public void valid() {
                setRequire(true);
               
            }
        }); 
              
        b2.put("b2r3s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(14);
                setMax(25);
                setRequire(true);
               
            }
        }); 

        b2.put("b2r3s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(14);
                setMax(25);
                setRequire(true);
               
}
}); 



        b2.put("b2r5", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                setRequire(true);
               
            }
        });

            Blok blok2 = new Blok(b2);
            k1.put("b2", blok2);

//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 3 |---------------------------------------
//----------------------------------------------------------------------------------------        
        
        Hashtable<String, SuperVariabel> b3 = new Hashtable();
        
        b3.put("b3r1", new Text() {
            
            @Override
            public void valid() {
                
                setRequire(true);
            }
        });
        
        b3.put("b3r2", new IntNumber() {
            
            @Override
            public void valid() {
                
                setMin(0);
                setMax(99);
                setRequire(true);
            }
        });
        
        b3.put("b3r3", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 && value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(2);
                if (value < 1 || value > 10) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r5", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 && value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(2);
                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r7s1", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b3.put("b3r7s2", new IntNumber() {
           
            @Override
            public void valid() {
            
                setMin(55000);
                setMax(80000);
                setRequire(true);
                
            }
            
        });
        
        b3.put("b3r8", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value < 1 || value > 7) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r8lainnya", new Text() {
            
            @Override
            public void valid() {
                
                if (!var("b3r8").equals("7")) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
                    
            }
        });
        
        b3.put("b3r9s1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r9s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(7);
                setRequire(true);
            }
        });
        
        b3.put("b3r10", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value < 1 || value > 4) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r10lainnya", new Text() {
            
            @Override
            public void valid() {
                
                if (!var("b3r10").equals("3")) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
                    
            }
        });
        
        b3.put("b3r11s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(12);
                setRequire(true);
            }
        });
        
        b3.put("b3r11s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1900);
                setMax(2016);
                setRequire(true);
            }
        });
        
        b3.put("b3r12s1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r12s2", new Text() {
            
            @Override
            public void valid() {
                
                    setRequire(true);
                }
                    
            });
        
        b3.put("b3r13s1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r13s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r13s2lainnya", new Text() {
            
            @Override
            public void valid() {
                
                if (Integer.parseInt(var("b3r13s2")) <= 15) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
                    
            }
        });
        
        b3.put("b3r14s1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r14s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(127);
                setRequire(true);
            }
        });
        
        b3.put("b3r14s2lainnya", new Text() {
            
            @Override
            public void valid() {
                
                if (Integer.parseInt(var("b3r14s2")) <= 63) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
                    
            }
        });
        
        b3.put("b3r15", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r16", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r17", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s1t1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s1t2", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s1t3", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s1t4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s1t5", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s1t6", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s2t1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s2t2", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s2t3", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s2t4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s2t5", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r18s2t6", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 || value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
        b3.put("b3r19s1t1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s1t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(30);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s1t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s1t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(30);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s1t5", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s1t6", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s2t1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(30);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s2t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s2t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(30);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s2t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s2t5", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
            }
        });
        
        b3.put("b3r19s2t6", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(29);
                setRequire(true);
            }
        });
        
        Blok blok3 = new Blok(b3);
        k1.put("b3", blok3);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 4 |---------------------------------------
//----------------------------------------------------------------------------------------        
        
        Hashtable<String, SuperVariabel> b4 = new Hashtable();
        
        b4.put("b4ar1s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4ar1s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                    if (value < Integer.parseInt(var("b4ar1s1"))) {
                        setValid(false);
                        addMessage(MessageString.value202("Harusnya lebih besar dari low"));
                    }
                }
                
            }
        });
        
        b4.put("b4ar2", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4ar3", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
            }
        });
        
        b4.put("b4ar4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4ar5", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    setMin(1);
                    setMax(7);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4ar5lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("1")) {
                    setEnable(false);
                } else {
                    if (Integer.parseInt(var("b4ar5")) < 4) {
                        setEnable(false);
                    } else {
                        setRequire(true);
                    }
                }
                
            }
        });
        
        b4.put("b4br6", new IntNumber() {
            
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("2")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4br7s1", new IntNumber() {
            
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("2")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4br7s2", new IntNumber() {
            
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("2")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                    if (value < Integer.parseInt(var("b4br7s1"))) {
                        setValid(false);
                        addMessage(MessageString.value202("Peak harusnya lebih besar"));
                    }
                }
                
            }
        });
        
        b4.put("b4br8", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("2")) {
                    setEnable(false);
                } else {
                    setMin(1);
                    setMax(7);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4br8lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("2")) {
                    setEnable(false);
                } else {
                    if (Integer.parseInt(var("b4br8")) < 4) {
                        setEnable(false);
                    } else {
                        setRequire(true);
                    }
                }
                
            }
        });
        
        b4.put("b4cr9", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("3")) {
                    setEnable(false);
                } else {
                    setMin(1);
                    setMax(7);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4cr10s1", new IntNumber() {
            
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("3")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4cr10s2", new IntNumber() {
            
            @Override
            public void valid() {
                
                if (!var("b1r10").equals("2")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999);
                    setRequire(true);
                    if (value < Integer.parseInt(var("b4cr10s1"))) {
                        setValid(false);
                        addMessage(MessageString.value202("Peak harusnya lebih besar"));
                    }
                }
                
            }
        });
        
        b4.put("b4dr11s1", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(2);
                    if (value < 1 || value > 12) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
                
        });
        
        b4.put("b4dr11s1lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (!var("b4dr11s1").equals("12")) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
            }
        });
        
        b4.put("b4dr11s2", new NumberSelect () {
           
            @Override
            public void valid() {
                
                if (Integer.parseInt(var("b4dr11s1")) < 5 || Integer.parseInt(var("b4dr11s1")) > 9) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value < 1 || value > 3) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
            }
        });
        
        b4.put("b4dr12", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr13", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr14s1", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value < 1 || value > 3) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr14s2", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value < 1 && value > 6) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr14s2lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (!var("b4dr14s1").equals("6")) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
            }
        });
        
        b4.put("b4dr15", new IntNumber() {
            
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
                
            }
        });
        
        b4.put("b4dr15lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (Integer.parseInt(var("b4dr15")) < 16) {
                    setEnable(false);
                } else {
                    setRequire(true);
                }
                
            }
        });
        
        b4.put("b4dr16", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr17s1", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr17s2", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr17s3", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr18", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        b4.put("b4dr19", new NumberSelect() {
            
            @Override
            public void valid() {
                
                setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                setRequire(true);
            }
        });
        
        Blok blok4 = new Blok(b4);
        k1.put("b4", blok4);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 5 |---------------------------------------
//----------------------------------------------------------------------------------------
        Hashtable<String, SuperVariabel> b5 = new Hashtable();

        b5.put("b5r1s1", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r1s2", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r1s3", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r1s4", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r1s5", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r1s6", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r1s7", new IntNumber() {

            @Override
            public void valid() {

                if (value > 16 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r2s1", new IntNumber() {

            @Override
            public void valid() {

                if (value > 999 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r2s2", new IntNumber() {

            @Override
            public void valid() {

                if (value > 999 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);

            }
        });
        
        b5.put("b5r2s3", new IntNumber() {

            @Override
            public void valid() {

                if (value > 999 || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s1t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s1t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s1t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s1t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s1t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s1t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
               setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s1t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t1x1"))+Integer.parseInt(var("b5r3s1t1x2"))+Integer.parseInt(var("b5r3s1t2x1"))+Integer.parseInt(var("b5r3s1t2x2"))+Integer.parseInt(var("b5r3s1t3x1"))+Integer.parseInt(var("b5r3s1t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------        
        
        b5.put("b5r3s2t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s2t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s2t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s2t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s2t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s2t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s2t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s2t1x1"))+Integer.parseInt(var("b5r3s2t1x2"))+Integer.parseInt(var("b5r3s2t2x1"))+Integer.parseInt(var("b5r3s2t2x2"))+Integer.parseInt(var("b5r3s2t3x1"))+Integer.parseInt(var("b5r3s2t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s3t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s3t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s3t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s3t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s3t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s3t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s3t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s3t1x1"))+Integer.parseInt(var("b5r3s3t1x2"))+Integer.parseInt(var("b5r3s3t2x1"))+Integer.parseInt(var("b5r3s3t2x2"))+Integer.parseInt(var("b5r3s3t3x1"))+Integer.parseInt(var("b5r3s3t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s4t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s4t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s4t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s4t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s4t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s4t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s4t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s4t1x1"))+Integer.parseInt(var("b5r3s4t1x2"))+Integer.parseInt(var("b5r3s4t2x1"))+Integer.parseInt(var("b5r3s4t2x2"))+Integer.parseInt(var("b5r3s4t3x1"))+Integer.parseInt(var("b5r3s4t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s5t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s5t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s5t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s5t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s5t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s5t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s5t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s5t1x1"))+Integer.parseInt(var("b5r3s5t1x2"))+Integer.parseInt(var("b5r3s5t2x1"))+Integer.parseInt(var("b5r3s5t2x2"))+Integer.parseInt(var("b5r3s5t3x1"))+Integer.parseInt(var("b5r3s5t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s6t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s6t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s6t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s6t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s6t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s6t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s6t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s6t1x1"))+Integer.parseInt(var("b5r3s6t1x2"))+Integer.parseInt(var("b5r3s6t2x1"))+Integer.parseInt(var("b5r3s6t2x2"))+Integer.parseInt(var("b5r3s6t3x1"))+Integer.parseInt(var("b5r3s6t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s7t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s7t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s7t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s7t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s7t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s7t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s7t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s7t1x1"))+Integer.parseInt(var("b5r3s7t1x2"))+Integer.parseInt(var("b5r3s7t2x1"))+Integer.parseInt(var("b5r3s7t2x2"))+Integer.parseInt(var("b5r3s7t3x1"))+Integer.parseInt(var("b5r3s7t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s8t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s8t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s8t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s8t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s8t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s8t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s8t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s8t1x1"))+Integer.parseInt(var("b5r3s8t1x2"))+Integer.parseInt(var("b5r3s8t2x1"))+Integer.parseInt(var("b5r3s8t2x2"))+Integer.parseInt(var("b5r3s8t3x1"))+Integer.parseInt(var("b5r3s8t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s9t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s9t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s9t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s9t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s9t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s9t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s9t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s9t1x1"))+Integer.parseInt(var("b5r3s9t1x2"))+Integer.parseInt(var("b5r3s9t2x1"))+Integer.parseInt(var("b5r3s9t2x2"))+Integer.parseInt(var("b5r3s9t3x1"))+Integer.parseInt(var("b5r3s9t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s10t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s10t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s10t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s10t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s10t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r3s10t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
//--------------------------------------------------------------------------------------------------------        
        b5.put("b5r3s10t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s10t1x1"))+Integer.parseInt(var("b5r3s10t1x2"))+Integer.parseInt(var("b5r3s10t2x1"))+Integer.parseInt(var("b5r3s10t2x2"))+Integer.parseInt(var("b5r3s10t3x1"))+Integer.parseInt(var("b5r3s10t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
//---------------------------------------------------------------------------------------------------------
        
        b5.put("b5r3s11t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t1x1"))+Integer.parseInt(var("b5r3s2t1x1"))+Integer.parseInt(var("b5r3s3t1x1"))+Integer.parseInt(var("b5r3s4t1x1"))+Integer.parseInt(var("b5r3s5t1x1"))+Integer.parseInt(var("b5r3s6t1x1"))+Integer.parseInt(var("b5r3s7t1x1"))+Integer.parseInt(var("b5r3s8t1x1"))+Integer.parseInt(var("b5r3s9t1x1"))+Integer.parseInt(var("b5r3s10t1x1")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
        
        b5.put("b5r3s11t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t1x2"))+Integer.parseInt(var("b5r3s2t1x2"))+Integer.parseInt(var("b5r3s3t1x2"))+Integer.parseInt(var("b5r3s4t1x2"))+Integer.parseInt(var("b5r3s5t1x2"))+Integer.parseInt(var("b5r3s6t1x2"))+Integer.parseInt(var("b5r3s7t1x2"))+Integer.parseInt(var("b5r3s8t1x2"))+Integer.parseInt(var("b5r3s9t1x2"))+Integer.parseInt(var("b5r3s10t1x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
        
        b5.put("b5r3s11t2x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t2x1"))+Integer.parseInt(var("b5r3s2t2x1"))+Integer.parseInt(var("b5r3s3t2x1"))+Integer.parseInt(var("b5r3s4t2x1"))+Integer.parseInt(var("b5r3s5t2x1"))+Integer.parseInt(var("b5r3s6t2x1"))+Integer.parseInt(var("b5r3s7t2x1"))+Integer.parseInt(var("b5r3s8t2x1"))+Integer.parseInt(var("b5r3s9t2x1"))+Integer.parseInt(var("b5r3s10t2x1")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
        
        b5.put("b5r3s11t2x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t2x2"))+Integer.parseInt(var("b5r3s2t2x2"))+Integer.parseInt(var("b5r3s3t2x2"))+Integer.parseInt(var("b5r3s4t2x2"))+Integer.parseInt(var("b5r3s5t2x2"))+Integer.parseInt(var("b5r3s6t2x2"))+Integer.parseInt(var("b5r3s7t2x2"))+Integer.parseInt(var("b5r3s8t2x2"))+Integer.parseInt(var("b5r3s9t2x2"))+Integer.parseInt(var("b5r3s10t2x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
        
        b5.put("b5r3s11t3x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t3x1"))+Integer.parseInt(var("b5r3s2t3x1"))+Integer.parseInt(var("b5r3s3t3x1"))+Integer.parseInt(var("b5r3s4t3x1"))+Integer.parseInt(var("b5r3s5t3x1"))+Integer.parseInt(var("b5r3s6t3x1"))+Integer.parseInt(var("b5r3s7t3x1"))+Integer.parseInt(var("b5r3s8t3x1"))+Integer.parseInt(var("b5r3s9t3x1"))+Integer.parseInt(var("b5r3s10t3x1")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
        
        b5.put("b5r3s11t3x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t3x2"))+Integer.parseInt(var("b5r3s2t3x2"))+Integer.parseInt(var("b5r3s3t3x2"))+Integer.parseInt(var("b5r3s4t3x2"))+Integer.parseInt(var("b5r3s5t3x2"))+Integer.parseInt(var("b5r3s6t3x2"))+Integer.parseInt(var("b5r3s7t3x2"))+Integer.parseInt(var("b5r3s8t3x2"))+Integer.parseInt(var("b5r3s9t3x2"))+Integer.parseInt(var("b5r3s10t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                
            }
        });
        
        b5.put("b5r3s11t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value != Integer.parseInt(var("b5r2s1"))) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if (value != (Integer.parseInt(var("b5r3s1t4"))+Integer.parseInt(var("b5r3s2t4"))+Integer.parseInt(var("b5r3s3t4"))+Integer.parseInt(var("b5r3s4t4"))+Integer.parseInt(var("b5r3s5t4"))+Integer.parseInt(var("b5r3s6t4"))+Integer.parseInt(var("b5r3s7t4"))+Integer.parseInt(var("b5r3s8t4"))+Integer.parseInt(var("b5r3s9t4"))+Integer.parseInt(var("b5r3s10t4")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah Vertikal"));
                }
                if (value != (Integer.parseInt(var("b5r3s11t1x1"))+Integer.parseInt(var("b5r3s11t1x2"))+Integer.parseInt(var("b5r3s11t2x1"))+Integer.parseInt(var("b5r3s11t2x2"))+Integer.parseInt(var("b5r3s11t3x1"))+Integer.parseInt(var("b5r3s11t3x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah Horizontal"));
                }
                
            }
        });
        
        b5.put("b5r4s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r4s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value > Integer.parseInt(var("b5r2s1")) || value <0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                if ((value + Integer.parseInt(var("b5r4s1"))) != Integer.parseInt(var("b5r2s1"))) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
        });
        
        b5.put("b5r5s1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value != 1 && value != 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r5s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b5r5s1").equals("2")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(Integer.parseInt(var("b5r2s1"))+Integer.parseInt(var("b5r2s2"))+Integer.parseInt(var("b5r2s3")));
                    setRequire(true);
                }
                
            }
        });
        
        b5.put("b5r6", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value < 1 || value > 7) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b5.put("b5r7", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value < 1 || value > 7) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        Blok blok5 = new Blok(b5);
        k1.put("b5", blok5);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 6 |---------------------------------------
//----------------------------------------------------------------------------------------  
        
        Hashtable<String, SuperVariabel> b6 = new Hashtable();
        
        b6.put("b6r1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                setLength(1);
                if (value < 1 || value > 3) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s1t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s1t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s1t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s1t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s1t1x1"))+Integer.parseInt(var("b6r2s1t1x2"))+Integer.parseInt(var("b6r2s1t2"));
                if (value != (Integer.parseInt(var("b6r2s1t1x1"))+Integer.parseInt(var("b6r2s1t1x2"))+Integer.parseInt(var("b6r2s1t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s2t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s2t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s2t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s2t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s2t1x1"))+Integer.parseInt(var("b6r2s2t1x2"))+Integer.parseInt(var("b6r2s2t2"));
                if (value != (Integer.parseInt(var("b6r2s2t1x1"))+Integer.parseInt(var("b6r2s2t1x2"))+Integer.parseInt(var("b6r2s2t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s3t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s3t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s3t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s3t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s3t1x1"))+Integer.parseInt(var("b6r2s3t1x2"))+Integer.parseInt(var("b6r2s3t2"));
                if (value != (Integer.parseInt(var("b6r2s3t1x1"))+Integer.parseInt(var("b6r2s3t1x2"))+Integer.parseInt(var("b6r2s3t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s4t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s4t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s4t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s4t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s4t1x1"))+Integer.parseInt(var("b6r2s4t1x2"))+Integer.parseInt(var("b6r2s4t2"));
                if (value != (Integer.parseInt(var("b6r2s4t1x1"))+Integer.parseInt(var("b6r2s4t1x2"))+Integer.parseInt(var("b6r2s4t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s5t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s5t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s5t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s5t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s5t1x1"))+Integer.parseInt(var("b6r2s5t1x2"))+Integer.parseInt(var("b6r2s5t2"));
                if (value != (Integer.parseInt(var("b6r2s5t1x1"))+Integer.parseInt(var("b6r2s5t1x2"))+Integer.parseInt(var("b6r2s5t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s6t1x1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s1t1x1"))+Integer.parseInt(var("b6r2s2t1x1"))+Integer.parseInt(var("b6r2s3t1x1"))+Integer.parseInt(var("b6r2s4t1x1"))+Integer.parseInt(var("b6r2s5t1x1"));
                if (value != (Integer.parseInt(var("b6r2s1t1x1"))+Integer.parseInt(var("b6r2s2t1x1"))+Integer.parseInt(var("b6r2s3t1x1"))+Integer.parseInt(var("b6r2s4t1x1"))+Integer.parseInt(var("b6r2s5t1x1")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s6t1x2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s1t1x2"))+Integer.parseInt(var("b6r2s2t1x2"))+Integer.parseInt(var("b6r2s3t1x2"))+Integer.parseInt(var("b6r2s4t1x2"))+Integer.parseInt(var("b6r2s5t1x2"));
                if (value != (Integer.parseInt(var("b6r2s1t1x2"))+Integer.parseInt(var("b6r2s2t1x2"))+Integer.parseInt(var("b6r2s3t1x2"))+Integer.parseInt(var("b6r2s4t1x2"))+Integer.parseInt(var("b6r2s5t1x2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s6t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s1t2"))+Integer.parseInt(var("b6r2s2t2"))+Integer.parseInt(var("b6r2s3t2"))+Integer.parseInt(var("b6r2s4t2"))+Integer.parseInt(var("b6r2s5t2"));
                if (value != (Integer.parseInt(var("b6r2s1t2"))+Integer.parseInt(var("b6r2s2t2"))+Integer.parseInt(var("b6r2s3t2"))+Integer.parseInt(var("b6r2s4t2"))+Integer.parseInt(var("b6r2s5t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r2s6t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r2s1t3"))+Integer.parseInt(var("b6r2s2t3"))+Integer.parseInt(var("b6r2s3t3"))+Integer.parseInt(var("b6r2s4t3"))+Integer.parseInt(var("b6r2s5t3"));
                if (value != (Integer.parseInt(var("b6r2s1t3"))+Integer.parseInt(var("b6r2s2t3"))+Integer.parseInt(var("b6r2s3t3"))+Integer.parseInt(var("b6r2s4t3"))+Integer.parseInt(var("b6r2s5t3"))) || value != (Integer.parseInt(var("b6r2s6t1x1"))+Integer.parseInt(var("b6r2s6t1x2"))+Integer.parseInt(var("b6r2s6t2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
                
            }
        });
        
        b6.put("b6r3s1t1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r3s1t2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r3s1t3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r3s1t4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
                
            }
        });
        
        b6.put("b6r3s1t5ket", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b6.put("b6r3s1t5", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b6r3s1t5ket").equals("")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999999);
                    setRequire(true);
                }
                
            }
        });
        
        b6.put("b6r3s1t6ket", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b6.put("b6r3s1t6", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b6r3s1t6ket").equals("")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999999);
                    setRequire(true);
                }
                
            }
        });
        
        b6.put("b6r3s1t7ket", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b6.put("b6r3s1t7", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b6r3s1t7ket").equals("")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999999);
                    setRequire(true);
                }
                
            }
        });
        
        b6.put("b6r3s1t8ket", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b6.put("b6r3s1t8", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b6r3s1t8ket").equals("")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999999);
                    setRequire(true);
                }
                
            }
        });
        
        b6.put("b6r3s1t9ket", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b6.put("b6r3s1t9", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b6r3s1t9ket").equals("")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999999);
                    setRequire(true);
                }
                
            }
        });
        
        b6.put("b6r3s1t10ket", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        b6.put("b6r3s1t10", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (var("b6r3s1t10ket").equals("")) {
                    setEnable(false);
                } else {
                    setMin(0);
                    setMax(9999999);
                    setRequire(true);
                }
                
            }
        });
        
        b6.put("b6r3s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = getToAdd("b6r3s1t1")+getToAdd("b6r3s1t2")+getToAdd("b6r3s1t3")+getToAdd("b6r3s1t4")+getToAdd("b6r3s1t5")+getToAdd("b6r3s1t6")+getToAdd("b6r3s1t7")+getToAdd("b6r3s1t8")+getToAdd("b6r3s1t9")+getToAdd("b6r3s1t10");
                if (value != (getToAdd("b6r3s1t1")+getToAdd("b6r3s1t2")+getToAdd("b6r3s1t3")+getToAdd("b6r3s1t4")+getToAdd("b6r3s1t5")+getToAdd("b6r3s1t6")+getToAdd("b6r3s1t7")+getToAdd("b6r3s1t8")+getToAdd("b6r3s1t9")+getToAdd("b6r3s1t10"))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah harusnya Valid"));
                }
                setRequire(true);
                
            }
            
            public Integer getToAdd(String a) {
                Integer temp;
                try {
                    if (var(a).equals("")) {
                        temp = 0;
                    } else {
                        temp = Integer.parseInt(var(a));
                    }
                } catch(Exception ex) {
                    return 0;
                }
                return temp;
                
            }
        });
        
        b6.put("b6r3s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
            }
                
        });
        
        b6.put("b6r3s3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
            }
                
        });
        
        b6.put("b6r3s4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = getToAdd("b6r3s1t1")+getToAdd("b6r3s1t2")+getToAdd("b6r3s1t3")+getToAdd("b6r3s1t4")+getToAdd("b6r3s1t5")+getToAdd("b6r3s1t6")+getToAdd("b6r3s1t7")+getToAdd("b6r3s1t8")+getToAdd("b6r3s1t9")+getToAdd("b6r3s1t10")+getToAdd("b6r3s2")+getToAdd("b6r3s3");
                if (value != (getToAdd("b6r3s1t1")+getToAdd("b6r3s1t2")+getToAdd("b6r3s1t3")+getToAdd("b6r3s1t4")+getToAdd("b6r3s1t5")+getToAdd("b6r3s1t6")+getToAdd("b6r3s1t7")+getToAdd("b6r3s1t8")+getToAdd("b6r3s1t9")+getToAdd("b6r3s1t10")+getToAdd("b6r3s2")+getToAdd("b6r3s3"))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah harusnya Valid"));
                }
                setRequire(true);
                
            }
            
            public Integer getToAdd(String a) {
                Integer temp;
                try {
                    if (var(a).equals("")) {
                        temp = 0;
                    } else {
                        temp = Integer.parseInt(var(a));
                    }
                } catch(Exception ex) {
                    return 0;
                }
                return temp;
                
            }
        });
        
        b6.put("b6r4s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
            }
                
        });
        
        b6.put("b6r4s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                setRequire(true);
            }
                
        });
        
        b6.put("b6r4s3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(9999999);
                value = Integer.parseInt(var("b6r4s1")+var("b6r4s2"));
                if (value != (Integer.parseInt(var("b6r4s1")+var("b6r4s2")))) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah"));
                }
                setRequire(true);
            }
                
        });
        
        Blok blok6 = new Blok(b6);
        k1.put("b6", blok6);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 7 |---------------------------------------
//----------------------------------------------------------------------------------------        
        
        Hashtable<String, SuperVariabel> b7 = new Hashtable();
        
        b7.put("b7r1s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(100);
                setRequire(true);
                
            }
        });
        
        b7.put("b7r1s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(0);
                setMax(100);
                if ((value + Integer.parseInt(var("b7r1s1"))) != 100) {
                    setValid(false);
                    addMessage(MessageString.value202("Jumlah harus 100"));
                }
                setRequire(true);
                
            }
        });
        
        b7.put("b7r2s1", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r2s2", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r2s3", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r2s4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r2s5", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
            }
        });
        
        b7.put("b7r2s6", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r2s7", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value != 1 && value != 2) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r2s7lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    if (!var("b7r2s7").equals("1")) {
                        setEnable(false);
                    } else {
                        setRequire(true);
                    }
                }
            }
        });
        
        b7.put("b7r3", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value < 1 && value > 7) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r3lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (var("b7r1s1").equals("100")) {
                    setEnable(false);
                } else {
                    if (!var("b7r3").equals("7")) {
                        setEnable(false);
                    } else {
                        setRequire(true);
                    }
                }
            }
        });
        
        b7.put("b7r4", new NumberSelect() {
           
            @Override
            public void valid() {
                
                if (!var("b7r1s1").equals("100") || !var("b7r2s1").equals("2")) {
                    setEnable(false);
                } else {
                    setLength(1);
                    if (value < 1 && value > 7) {
                        setValid(false);
                        addMessage(MessageString.OUT_RANGE);
                    }
                    setRequire(true);
                }
                
            }
        });
        
        b7.put("b7r4lainnya", new Text() {
           
            @Override
            public void valid() {
                
                if (!var("b7r1s1").equals("100") || !var("b7r2s1").equals("2")) {
                    setEnable(false);
                } else {
                    if (!var("b7r4").equals("7")) {
                        setEnable(false);
                    } else {
                        setRequire(true);
                    }
                }
            }
        });
        
        Blok blok7 = new Blok(b7);
        k1.put("b7", blok7);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 8 |---------------------------------------
//---------------------------------------------------------------------------------------- 
        
        Hashtable<String, SuperVariabel> b8 = new Hashtable();
        
        b8.put("b8r1", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
        });
        
        b8.put("b8r2", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
        });
        
        b8.put("b8r3", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
        });
        
        b8.put("b8r4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(31);
                setRequire(true);
                
            }
        });
        
        Blok blok8 = new Blok(b8);
        k1.put("b8", blok8);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 9 |---------------------------------------
//----------------------------------------------------------------------------------------  
        
        Hashtable<String, SuperVariabel> b9 = new Hashtable();
        
        b9.put("catatan", new Text() {
           
            @Override
            public void valid() {
                
                
            }
        });
        
        Blok blok9 = new Blok(b9);
        k1.put("b9", blok9);
        
        
        Controller.setDS(false);
        Controller.setNksComponent("b1r2","b1r3","b1r4","b1r5","b1r6","b1r7");
        Controller.setDict(k1);
    }
}