
package qltour.view;

import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import qltour.model.HopDong;
import qltour.model.Tour;
import qltour.managedata.IO;

public class TongHopJPanel extends javax.swing.JPanel {

    public TongHopJPanel() {
        initComponents();
        o = new IO();
        format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(3);
        format.setMinimumFractionDigits(0);
        format.setMaximumIntegerDigits(15);
        format.setMinimumIntegerDigits(0);
        setTable();

    }
     
     public void setTable() {
        listTK = new ArrayList<>();
    	DefaultTableModel defaultTableModel = new DefaultTableModel();
        table.setModel(defaultTableModel);
        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Mã Tour");
        defaultTableModel.addColumn("Tên Tour");
        defaultTableModel.addColumn("Lượng Khách");
        defaultTableModel.addColumn("Doanh Thu");
        listTour = o.loadData(listTour, "dsTour1.dat");
        listHD = o.loadData(listHD,"dsHD.dat");
        float S = 0;
        for (int i=0;i<listTour.size();i++) {
        	int count = 0;
        	for(HopDong hd : listHD) {
        		if(hd.getMaTour().compareTo(listTour.get(i).getID_Tour())==0) count++;
        	}
            defaultTableModel.addRow(new Object[]{i+1,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,format.format(count*listTour.get(i).getPrice_Tour())} );
            listTK.add(new Object[]{i+1,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,count*listTour.get(i).getPrice_Tour()});
            System.out.println();
            S+=count*listTour.get(i).getPrice_Tour();
        }
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );

        lb_doanhthu.setText("Tổng doanh thu: "+format.format(S));
        lb_soTour.setText("Tổng số Tour: "+listTour.size());
        


    }
     
    public void setTable1() {
        listTK = new ArrayList<>();
    	DefaultTableModel defaultTableModel = new DefaultTableModel();
        table.setModel(defaultTableModel);
        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Mã Tour");
        defaultTableModel.addColumn("Tên Tour");
        defaultTableModel.addColumn("Lượng Khách");
        defaultTableModel.addColumn("Doanh Thu");
        listTour = o.loadData(listTour, "dsTour1.dat");
        listHD = o.loadData(listHD,"dsHD.dat");
        float S = 0;
        int j=1;
        for (int i=0;i<listTour.size();i++) {
        	int count = 0;
        	for(HopDong hd : listHD) {
        		if(hd.getMaTour().compareTo(listTour.get(i).getID_Tour())==0) count++;
        	}
            if(count>0){
                defaultTableModel.addRow(new Object[]{j++,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,format.format(count*listTour.get(i).getPrice_Tour())} );
                listTK.add(new Object[]{i+1,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,count*listTour.get(i).getPrice_Tour()});
                S+=count*listTour.get(i).getPrice_Tour();
            }
            
        }
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );

        lb_doanhthu.setText("Tổng doanh thu: "+format.format(S));
        lb_soTour.setText("Tổng số Tour: "+listTK.size());

    }
    
    public void setTable2() {
        listTK = new ArrayList<>();
    	DefaultTableModel defaultTableModel = new DefaultTableModel();
        table.setModel(defaultTableModel);
        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Mã Tour");
        defaultTableModel.addColumn("Tên Tour");
        defaultTableModel.addColumn("Lượng Khách");
        defaultTableModel.addColumn("Doanh Thu");
        listTour = o.loadData(listTour, "dsTour1.dat");
        listHD = o.loadData(listHD,"dsHD.dat");
        int j =1;
        for (int i=0;i<listTour.size();i++) {
        	int count = 0;
        	for(HopDong hd : listHD) {
        		if(hd.getMaTour().compareTo(listTour.get(i).getID_Tour())==0) count++;
        	}
            if(count==0){
                defaultTableModel.addRow(new Object[]{j++,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,count*listTour.get(i).getPrice_Tour()} );
                listTK.add(new Object[]{i+1,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,count*listTour.get(i).getPrice_Tour()});           
            }
            
        }
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );

        lb_doanhthu.setText("Tổng doanh thu: 0");
        lb_soTour.setText("Tổng số Tour: "+listTK.size());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lb_doanhthu = new javax.swing.JLabel();
        lb_soTour = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Luachon = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        lb_doanhthu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_doanhthu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_doanhthu.setText("Tổng doanh thu: ");

        lb_soTour.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_soTour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_soTour.setText("Tổng số Tour: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addComponent(lb_doanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(lb_soTour, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(676, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lb_doanhthu)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(lb_soTour)
                    .addGap(38, 38, 38)))
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống Kê");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        Luachon.setBackground(new java.awt.Color(204, 204, 204));
        Luachon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả Tour", "Tour đã có khách", "Tour chưa có khách" }));
        Luachon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuachonActionPerformed(evt);
            }
        });
        jPanel2.add(Luachon, java.awt.BorderLayout.LINE_END);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        table.setBackground(new java.awt.Color(153, 204, 255));
        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Tour", "Tên Tour", "Só Lượng khách hàng", "Doanh thu"
            }
        ));
        table.setAlignmentY(10.0F);
        table.setName(""); // NOI18N
        table.setRequestFocusEnabled(false);
        table.setSelectionBackground(new java.awt.Color(255, 153, 102));
        jScrollPane2.setViewportView(table);

        add(jScrollPane2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void LuachonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuachonActionPerformed
        // TODO add your handling code here:
        if(Luachon.getSelectedIndex()==0){
            setTable();
        }else if(Luachon.getSelectedIndex()==1){
            setTable1();
        }else if( Luachon.getSelectedIndex()==2){
            setTable2();
        }
    }//GEN-LAST:event_LuachonActionPerformed


    private IO o;
    private ArrayList<Object> listTK;
    private ArrayList<Tour> listTour;
    private ArrayList<HopDong> listHD;
    private NumberFormat format;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Luachon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_doanhthu;
    private javax.swing.JLabel lb_soTour;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
