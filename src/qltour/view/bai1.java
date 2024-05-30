
package qltour.view;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import qltour.managedata.IO;
import qltour.model.HopDong;
import qltour.model.Tour;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class bai1 extends javax.swing.JPanel {

    public bai1() {
        initComponents();
        setTable();
    }

    public void setTable() {
    	DefaultTableModel defaultTableModel = new DefaultTableModel();
        table.setModel(defaultTableModel);
        ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");
        defaultTableModel.addColumn("");
        defaultTableModel.addRow(new Object[] {"STT","MÃ TOUR","TÊN TOUR","LƯỢNG KHÁCH","DOANH THU"});
        listTour = o.loadData(listTour, "dsTour1.dat");
        listHD = o.loadData(listHD,"dsHD.dat");
        float S = 0;
        for (int i=0;i<listTour.size();i++) {
        	int count = 0;
        	for(HopDong hd : listHD) {
        		if(hd.getMaTour().compareTo(listTour.get(i).getID_Tour())==0) count++;
        	}
            defaultTableModel.addRow(new Object[]{i+1,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,count*listTour.get(i).getPrice_Tour()} );
            listTK.add(new Object[]{i+1,listTour.get(i).getID_Tour(),listTour.get(i).getName_Tour(),count,count*listTour.get(i).getPrice_Tour()});
            System.out.println();
            S+=count*listTour.get(i).getPrice_Tour();
        }
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );
        defaultTableModel.addRow(new Object[]{null,null,null,null,null} );

        lbTongTour.setText("Số Tour đang mở : "+(table.getRowCount()-5));
        lbDoanhThu.setText("Tổng doanh thu: "+S);
        JScrollPane jScrollPane = new JScrollPane();
        table.add(jScrollPane);


    }
    
    private void initComponents() {
    	listTK = new ArrayList<Object>();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBorder(new LineBorder(new Color(0, 0, 0)));
        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        table = new JTable();
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setBackground(new Color(255, 240, 245));
        table.setFont(table.getFont().deriveFont(table.getFont().getSize() + 2f));
        
        lbTongTour = new JLabel("Tổng số Tour đã mở:");
        lbTongTour.setForeground(new Color(210, 105, 30));
        lbTongTour.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        lbDoanhThu = new JLabel("Tổng doanh thu:");
        lbDoanhThu.setForeground(new Color(210, 105, 30));
        lbDoanhThu.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        panel = new JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(64)
        			.addComponent(lbTongTour, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
        			.addComponent(lbDoanhThu, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
        			.addGap(94))
        		.addComponent(table, GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1023, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        			.addGap(97)
        			.addComponent(table, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)
        			.addGap(56)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbDoanhThu, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbTongTour, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(32, Short.MAX_VALUE))
        );
        
        lbTitle = new JLabel("Thống kê Tour");
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 34));
        panel.add(lbTitle);
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );
        this.setLayout(layout);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private JTable table;
    private ArrayList<Tour> listTour;
    private ArrayList<HopDong> listHD;
    static IO o = new IO();
    private JLabel lbTongTour;
    private JLabel lbDoanhThu;
    private JPanel panel;
    private JLabel lbTitle;
    private ArrayList<Object> listTK;
}


