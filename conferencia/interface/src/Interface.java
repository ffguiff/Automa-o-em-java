//importações
import java.awt.AWTException;   
import java.awt.Robot;   
import java.awt.event.KeyEvent;   
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
public class Interface extends javax.swing.JFrame {

    private static String jTextField1ActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Interface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("RM");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RM(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Ordem");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text(evt);
            }
        });

        jButton1.setText("Efetiva");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Efetiva(evt);
            }
        });

        jButton2.setText("Historico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Historico(evt);
            }
        });

        jButton3.setText("Liberação");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Liberacao(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function do bottun efetiva
    private void Efetiva(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Efetiva
        try {
            Zpp223();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Efetiva
//campo de text
    private void text(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text

    }//GEN-LAST:event_text
//function do bottun historico
    private void Historico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Historico
        try {
            Zpp230();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Historico
//function do bottun liberação
    private void Liberacao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Liberacao
        try{
            Zpp225();
        }catch(IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }catch(AWTException ex){
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }catch(InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_Liberacao
//RM
    private void RM(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RM
        try {
            Zpp223();
            Zpp225();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RM

    //main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    //nomes das variaveis da interface
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

 //functions
public static void Zpp223() throws IOException, AWTException, InterruptedException{
          Robot robot = new Robot();  

          //campo referente a transação
          robot. mouseMove(50, 100);
          robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
          robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_Z);
          robot.keyPress(KeyEvent.VK_P);
          robot.keyPress(KeyEvent.VK_P);
          robot.keyPress(KeyEvent.VK_2);
          robot.keyPress(KeyEvent.VK_2);
          robot.keyPress(KeyEvent.VK_3);
          //confirmar transação
          robot.keyPress(KeyEvent.VK_F8);
          robot.keyRelease(KeyEvent.VK_F8);
          
          //ir para campo referente a ordem
          Thread.sleep(700);
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);
          //colar ordem salva em CTRL+C
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          
          //desse para o campo referente a o centro
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);
          
          //digita o centro
          Thread.sleep(200);
          centro();
          
          //confirmação dos dados de consulta
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_F8);
          robot.keyRelease(KeyEvent.VK_F8);
          
          Thread.sleep(700);
          locl();
          
          //voltar
          Thread.sleep(700);
          robot.keyPress(KeyEvent.VK_F3);
          robot.keyRelease(KeyEvent.VK_F3);
          robot.keyPress(KeyEvent.VK_F3);
          robot.keyRelease(KeyEvent.VK_F3);
}//efetiva
public static void Zpp230() throws IOException, AWTException, InterruptedException{
          Robot robot = new Robot(); 
          //campo referente a transação
          robot. mouseMove(50, 100);
          robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
          robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_Z);
          robot.keyPress(KeyEvent.VK_P);
          robot.keyPress(KeyEvent.VK_P);
          robot.keyPress(KeyEvent.VK_2);
          robot.keyPress(KeyEvent.VK_3);
          robot.keyPress(KeyEvent.VK_0);   
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_F8);
          robot.keyRelease(KeyEvent.VK_F8);
          //digita o centro
          centro();
          robot.keyPress(KeyEvent.VK_DOWN);
          robot.keyRelease(KeyEvent.VK_DOWN);
          //cola ordem salva no CTRL+C
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_F8);
          robot.keyRelease(KeyEvent.VK_F8);
          Thread.sleep(700);
          
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_A);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          
          robot.mouseMove(533,117);
          robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
          robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
          
}//historico
public static void Zpp225() throws IOException, AWTException, InterruptedException{
          Robot robot = new Robot(); 
          //campo referente a transação
          robot. mouseMove(50, 100);
          robot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
          robot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_Z);
          robot.keyPress(KeyEvent.VK_P);
          robot.keyPress(KeyEvent.VK_P);
          robot.keyPress(KeyEvent.VK_2);
          robot.keyPress(KeyEvent.VK_0);
          robot.keyPress(KeyEvent.VK_5);
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_F8);
          robot.keyRelease(KeyEvent.VK_F8);
          
          //campo referente ao centro
          Thread.sleep(200);
          centro();
          
          //compo referente a ordem
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_UP);
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_V);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_F8);
          robot.keyRelease(KeyEvent.VK_F8);
          Thread.sleep(700);
          
          //marcar todas as caixas
          robot.keyPress(KeyEvent.VK_CONTROL);
          robot.keyPress(KeyEvent.VK_A);
          robot.keyRelease(KeyEvent.VK_CONTROL);
          //referente a impressão
          Thread.sleep(200);
          robot.keyPress(KeyEvent.VK_F9);
          robot.keyRelease(KeyEvent.VK_F9);
          
          Thread.sleep(700);
          locl();
          
          Thread.sleep(700);
          robot.keyPress(KeyEvent.VK_F3); 
          robot.keyRelease(KeyEvent.VK_F3);
          robot.keyPress(KeyEvent.VK_F3);
          robot.keyRelease(KeyEvent.VK_F3);
}//liberação de linha
public static void centro() throws IOException, AWTException, InterruptedException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_5);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_0);
        robot.keyPress(KeyEvent.VK_1);
    }//centro de custo
public static void locl() throws IOException, AWTException, InterruptedException{
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_L);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_L);
                  
        //parte de impressão
        //dar e vezes a função UP
        Thread.sleep(200);
        for(int i = 0;i != 3; i++){
           robot.keyPress(KeyEvent.VK_UP);
        };
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}
