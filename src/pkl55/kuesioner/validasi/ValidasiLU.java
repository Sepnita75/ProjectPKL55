/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkl55.kuesioner.validasi;

/**
 *
 * @author REYHAN
 */
import pkl55.data.controller.Loop;
import pkl55.data.controller.SuperVariabel;
import pkl55.data.controller.IntNumber;
import pkl55.data.controller.MessageString;
import pkl55.data.controller.Blok;
import pkl55.data.controller.NumberSelect;
import java.util.Hashtable;
import pkl55.data.controller.Controller;
import pkl55.data.controller.Text;
import pkl55.data.controller.Variabel;

public class ValidasiLU {

    public static void kuesioner() {
        Hashtable<String, Blok> k1 = new Hashtable();

//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 1 |---------------------------------------
//----------------------------------------------------------------------------------------
        
        Hashtable<String, SuperVariabel> b1 = new Hashtable();
        
        b1.put("b1r1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                if(value!=1 && value!=8) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }

            }
        });
        
        b1.put("b1r2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(999);
                setRequire(true);

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

        b1.put("b1r4", new NumberSelect() {
           
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

        b1.put("b1r5", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(9999);
                setRequire(true);
                
            }
        });

        b1.put("b1r6", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
               
            }
        }); 
  
        Blok blok1 = new Blok(b1);
        k1.put("b1", blok1);

//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 2 |---------------------------------------
//----------------------------------------------------------------------------------------
        
        Hashtable<String, SuperVariabel> b2 = new Hashtable();
        
        b2.put("b2r1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(999);
                setRequire(true);

            }
        });
          
        b2.put("b2r2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(1);
                setMax(999);
                setRequire(true);

            }
        });

        Blok blok2 = new Blok(b2);
        k1.put("b2", blok2);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 3 |---------------------------------------
//----------------------------------------------------------------------------------------
        
        Hashtable<String, SuperVariabel> b3 = new Hashtable();
           
        b3.put("b3r1s1", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
               
            }   
        }); 

        b3.put("b3r1s2", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
               
            }
        }); 

        b3.put("b3r2s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                    
            }
        }); 


        b3.put("b3r2s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
               
            }
        }); 

              
        b3.put("b3r3s1", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(14);
                setMax(25);
                setRequire(true);
               
            }
        }); 

        b3.put("b3r3s2", new IntNumber() {
           
            @Override
            public void valid() {
                
                setMin(14);
                setMax(25);
                setRequire(true);
               
            }
        }); 
                        
        Blok blok3 = new Blok(b3);
        k1.put("b3", blok3);
        
//----------------------------------------------------------------------------------------
//---------------------------------------| BLOK 4 |---------------------------------------
//----------------------------------------------------------------------------------------
        
        Hashtable<String, SuperVariabel> b4 = new Hashtable();
        Hashtable<String, Variabel> loop4 = new Hashtable();
        
        b4.put("loopnya", new Loop(loop4));
        
        loop4.put("b4r1", new Text() {

            @Override
            public void valid() {

                setRequire(true);

            }
        });
        
        loop4.put("b4r2", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
        });
        
        loop4.put("b4r3", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
                if (value < 1 || value > 2) {
                    setValid(false);
                    addMessage(MessageString.range402(1,2));
                }
                
            }
        });
        
        loop4.put("b4r4", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
                if (value < 0) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
        });
        
        loop4.put("b4r5", new Text() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
            }
        });
        
        loop4.put("b4r6", new IntNumber() {
           
            @Override
            public void valid() {
                
                setRequire(true);
                
                if (value < 1 || value > 2) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
        });
        
        loop4.put("b4r7", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value < 0 || value > 1) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
        });
        
        loop4.put("b4r8", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value < 0 || value > 1) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
        });
        
        loop4.put("b4r9", new IntNumber() {
           
            @Override
            public void valid() {
                
                if (value < 0 || value > 1) {
                    setValid(false);
                    addMessage(MessageString.OUT_RANGE);
                }
                
            }
        });
        
        Blok blok4 = new Blok(b4);
        k1.put("b4", blok4);
        
        Controller.setDS(true);
        Controller.setNksComponent("b1r1", "b1r2", "b1r3", "b1r4", "b1r5");
        Controller.setDict(k1);
    }
}
