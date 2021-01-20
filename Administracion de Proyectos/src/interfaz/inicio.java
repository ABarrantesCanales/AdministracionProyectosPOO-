/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import utilidades.Departamento;
import utilidades.Empleado;
import utilidades.Empresa;
import utilidades.Jefe;
import utilidades.Proyecto;
import utilidades.Recursos;
import utilidades.Tarea;

/**
 *
 * @author josue
 */
public class inicio extends javax.swing.JFrame {

    
    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
        comboActividades.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String name = (String) comboActividades.getSelectedItem();
                Empleado empleado = Empresa.getInstance().buscarEmpleadoNombre(name);
                textActividades.setText("");
                if(empleado != null || name != null){
                    textActividades.append(empleado.getNombre() + "\n");
                    if(!empleado.getTareas().isEmpty()){
                        ArrayList<Tarea> tareas = empleado.getTareas();
                        Collections.sort(tareas, new Comparator<Tarea>() {
                            @Override
                            public int compare(Tarea t, Tarea t1) {
                                return t.getFechaEntrega().compareTo(t1.getFechaEntrega());
                            }
                        });
                        for(Tarea T: tareas){
                            if(!T.getProyecto().tareasAtrasadas()){
                                if(T.getEstado() == false){
                                    textActividades.append("\t" + T.getNombre() + " del proyecto " + T.getProyecto().getNombre() + "\n");
                                
                                }
                            }else{ 
                                if(T.getEstado() == false){
                                    textActividades.append("\t" + T.getNombre() + " del proyecto " + T.getProyecto().getNombre() + "(Atrasado)\n");
                                }
                            }
                            
                        }
                    }else{
                        textActividades.append("\t" + "Esta persona no tiene tareas asignadas.");
                    }
                }else{
                    textActividades.setText("No se ha seleccionado una persona.");
                }
            }
        });
        comboCreacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                switch(comboCreacion.getSelectedItem().toString()){
                    case "Empleado":
                        ocultarComponentes("Empleado");
                        break;
                    case "Departamento":
                        ocultarComponentes("Departamento");
                        break;
                    case "Proyecto":
                        ocultarComponentes("Proyecto");
                        break;
                    case "Recurso":
                        ocultarComponentes("Recurso");
                        break;
                }
            }
        });
        tabListados.addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ce) {
                DefaultListModel listModel = new DefaultListModel();
                listModel.addElement("");
                jListados.setModel(listModel);
                textActividades.setText("");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnCostoProyectoPersonal1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btnCostoProyectoPersonal3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tabListados = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListados = new javax.swing.JList<>();
        btnListarProyectos = new javax.swing.JButton();
        btnPersonalConProyecto = new javax.swing.JButton();
        btnProyectosAtraso = new javax.swing.JButton();
        btnCostoProyecto = new javax.swing.JButton();
        btnCostoProyectoPersonal = new javax.swing.JButton();
        btnRecursosLibres = new javax.swing.JButton();
        btnPersonalDepa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        comboActividades = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textActividades = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        comboCreacion = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        labelCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        labelDepa = new javax.swing.JLabel();
        comboDepartamento = new javax.swing.JComboBox<>();
        btnCrearObjetos = new javax.swing.JButton();
        datePickerCreacion = new org.jdesktop.swingx.JXDatePicker();
        labelFecha = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Personal con proyectos");

        jButton7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton7.setText("Costo proyectos (todos los recursos)");

        btnCostoProyectoPersonal1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCostoProyectoPersonal1.setText("Costo proyectos (solo personal)");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jToggleButton1.setText("jToggleButton1");

        btnCostoProyectoPersonal3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCostoProyectoPersonal3.setText("Recursos libres");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Salario por hora: ");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setText("Nombre: ");

        jTextField14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel1.setText("Manejo de empresa");

        jListados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jListados);

        btnListarProyectos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnListarProyectos.setText("Listar proyectos");
        btnListarProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProyectosActionPerformed(evt);
            }
        });

        btnPersonalConProyecto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPersonalConProyecto.setText("Personal con proyectos");
        btnPersonalConProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalConProyectoActionPerformed(evt);
            }
        });

        btnProyectosAtraso.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnProyectosAtraso.setText("Proyectos con atraso");
        btnProyectosAtraso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectosAtrasoActionPerformed(evt);
            }
        });

        btnCostoProyecto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCostoProyecto.setText("Costo proyectos (todos los recursos)");
        btnCostoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoProyectoActionPerformed(evt);
            }
        });

        btnCostoProyectoPersonal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCostoProyectoPersonal.setText("Costo proyectos (solo personal)");
        btnCostoProyectoPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostoProyectoPersonalActionPerformed(evt);
            }
        });

        btnRecursosLibres.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRecursosLibres.setText("Recursos libres");
        btnRecursosLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosLibresActionPerformed(evt);
            }
        });

        btnPersonalDepa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPersonalDepa.setText("Personal por departamento");
        btnPersonalDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalDepaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnListarProyectos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPersonalDepa))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnProyectosAtraso)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRecursosLibres)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnPersonalConProyecto)
                                    .addGap(7, 7, 7))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnCostoProyecto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCostoProyectoPersonal))))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarProyectos)
                    .addComponent(btnPersonalDepa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProyectosAtraso)
                    .addComponent(btnPersonalConProyecto)
                    .addComponent(btnRecursosLibres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCostoProyecto)
                    .addComponent(btnCostoProyectoPersonal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabListados.addTab("Listados", jPanel1);

        comboActividades.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActividadesActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Actividades de:");

        textActividades.setEditable(false);
        textActividades.setColumns(20);
        textActividades.setRows(5);
        jScrollPane3.setViewportView(textActividades);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboActividades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        tabListados.addTab("Reportes Personales", jPanel3);

        jPanel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel4.setInheritsPopupMenu(true);

        comboCreacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        comboCreacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Departamento", "Proyecto", "Recurso" }));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Crear:");

        labelNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelNombre.setText("Nombre: ");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        labelSalario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelSalario.setText("Salario (por hora):");

        txtSalario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalarioKeyTyped(evt);
            }
        });

        labelCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelCedula.setText("Cedula:");

        txtCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        labelDepa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelDepa.setText("Departamento:");

        comboDepartamento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCrearObjetos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCrearObjetos.setText("Crear");
        btnCrearObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearObjetosActionPerformed(evt);
            }
        });

        labelFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelFecha.setText("Fecha de creación:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnCrearObjetos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(labelNombre)
                    .addComponent(labelSalario)
                    .addComponent(labelCedula)
                    .addComponent(labelDepa)
                    .addComponent(labelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboCreacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCedula)
                        .addComponent(txtSalario)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(datePickerCreacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(comboCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSalario)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDepa))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFecha)
                    .addComponent(datePickerCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnCrearObjetos)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        tabListados.addTab("Creacion", jPanel4);

        jButton4.setText("Manejo de Proyectos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabListados)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabListados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProyectosAtrasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectosAtrasoActionPerformed
        ArrayList<Proyecto> proyectos = Empresa.getInstance().getListaProyectos();
        DefaultListModel model = new DefaultListModel();    
        for(Proyecto p: proyectos){
            if(p.tareasAtrasadas()){
                model.addElement(p.getNombre());
            }
        }
        if(model.isEmpty()){
            model.addElement("No hay proyectos.");
        }
        jListados.setModel(model);
    }//GEN-LAST:event_btnProyectosAtrasoActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnListarProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProyectosActionPerformed
        ArrayList<Proyecto> proyectos = Empresa.getInstance().getListaProyectos();
        DefaultListModel model = new DefaultListModel();    
        model.addElement("Nombre de Proyecto: \t" + "Departamento(s) al que pertenece:");
        for(Proyecto p: proyectos){
            model.addElement(p.getNombre());
            if(!p.getDepartamentos().isEmpty()){
                for(Departamento d: p.getDepartamentos()){
                    model.addElement("\t\t" + d.getNombreDepartamento());
                }
                model.addElement("\t\t" + p.getDepaPrincipal());
            }else{
                model.addElement("\t\t" + p.getDepaPrincipal());
            }
        }
        if(model.isEmpty()){
            model.addElement("No hay proyectos.");
        }
        jListados.setModel(model);
    }//GEN-LAST:event_btnListarProyectosActionPerformed

    private void btnPersonalDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalDepaActionPerformed
        ArrayList<Departamento> depas = Empresa.getInstance().getListaDepartamentos();
        DefaultListModel model = new DefaultListModel();
        for(Departamento d: depas){
            model.addElement(d.getNombreDepartamento());
            for(Empleado e: d.getEmpleados()){
                model.addElement("\t" + e.getNombre() + ":");
                if(!e.getProyectos().isEmpty()){
                    for(Proyecto p: e.getProyectos()){
                       if(p.getDepaPrincipal() == d){
                           model.addElement("\t\t" + "Trabaja en " + p.getNombre() + " que es propio.");
                       }
                       model.addElement("\t\t" + "Trabaja en " + p.getNombre() + " que pertenece al " + p.getDepaPrincipal().getNombreDepartamento());
                    }
                }else{
                    model.addElement("No tiene proyectos asignados.");
                }
            }
        }
        if(model.isEmpty()){
            model.addElement("No hay personal.");
        }
        jListados.setModel(model);
    }//GEN-LAST:event_btnPersonalDepaActionPerformed

    private void btnRecursosLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursosLibresActionPerformed
        ArrayList<Recursos> recursos = Empresa.getInstance().getListaRecursos();
        DefaultListModel model = new DefaultListModel();
        for(Recursos r: recursos){
            if(r.getEstado() == false){
                model.addElement(r.getNombre());
            }
        }if(model.isEmpty()){
            model.addElement("No hay recursos.");
        }
        jListados.setModel(model);
    }//GEN-LAST:event_btnRecursosLibresActionPerformed

    private void btnPersonalConProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalConProyectoActionPerformed
        ArrayList<Jefe> jefes = Empresa.getInstance().getListaJefes();
        DefaultListModel model = new DefaultListModel();
        for(Jefe j: jefes){
            if(!j.getProyectos().isEmpty()){
                model.addElement(j.getNombre() + ":");
                for(Proyecto p: j.getProyectos()){
                    model.addElement("\t\t" + p.getNombre());
                }
            }
        }if(model.isEmpty()){
            model.addElement("No hay jefes.");
        }
        jListados.setModel(model);
    }//GEN-LAST:event_btnPersonalConProyectoActionPerformed

    public void setPersonalCombo(){
        if(Empresa.getInstance().getListaEmpleados().isEmpty() || Empresa.getInstance().getListaEmpleados() == null){
            comboActividades.setEnabled(false);
        }else{
            comboActividades.setEnabled(true);
            int size = Empresa.getInstance().getListaEmpleados().size();
            String[] empleados = new String[size];
            for(int i = 0; i < size; i++){
                empleados[i] = Empresa.getInstance().getListaEmpleados().get(i).getNombre();
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(empleados);
            comboActividades.setModel(model);
        }
    }
    
    public void ocultarComponentes(String string){
        switch(string){
            case "Empleado":
                        labelSalario.setVisible(true);
                        txtSalario.setVisible(true);
                        labelCedula.setVisible(true);
                        txtCedula.setVisible(true);
                        labelDepa.setVisible(true);
                        comboDepartamento.setVisible(true);
                        labelFecha.setVisible(false);
                        datePickerCreacion.setVisible(false);
                        break;
            case "Departamento":
                        labelSalario.setVisible(false);
                        txtSalario.setVisible(false);
                        labelCedula.setVisible(false);
                        txtCedula.setVisible(false);
                        labelDepa.setVisible(false);
                        comboDepartamento.setVisible(false);
                        labelFecha.setVisible(false);
                        datePickerCreacion.setVisible(false);
                        break;
            case "Proyecto":
                        labelSalario.setVisible(false);
                        txtSalario.setVisible(false);
                        labelCedula.setVisible(false);
                        txtCedula.setVisible(false);
                        labelDepa.setVisible(true);
                        comboDepartamento.setVisible(true);
                        labelFecha.setVisible(true);
                        datePickerCreacion.setVisible(true);
                        break;
            case "Recurso":
                        labelSalario.setVisible(false);
                        txtSalario.setVisible(false);
                        labelCedula.setVisible(false);
                        txtCedula.setVisible(false);
                        labelDepa.setVisible(false);
                        comboDepartamento.setVisible(false);
                        labelFecha.setVisible(false);
                        datePickerCreacion.setVisible(false);
                        break;
        }
    }
    
    
    
    
    
    private void comboActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActividadesActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
            txtCedula.setText("");
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyTyped
        char validar=evt.getKeyChar();
        
        if (Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
            txtSalario.setText("");
        }
    }//GEN-LAST:event_txtSalarioKeyTyped

    private void btnCrearObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearObjetosActionPerformed
        String opcion = comboCreacion.getSelectedItem().toString();
        switch(opcion){
            case "Empleado":
                Empleado empleado = new Empleado(Double.parseDouble(txtSalario.getText()), txtNombre.getText(),
                Integer.parseInt(txtCedula.getText()), Empresa.getInstance().buscarDepartamento(comboDepartamento.getSelectedItem().toString()));
                Empresa.getInstance().addEmpleado(empleado);
                JOptionPane.showMessageDialog(rootPane, "¡Empleado creado!");
                txtNombre.setText("");
                txtSalario.setText("");
                txtCedula.setText("");
                break;
            case "Departamento":
                Departamento depa = new Departamento(txtNombre.getText());
                Empresa.getInstance().addDepartamento(depa);
                JOptionPane.showMessageDialog(rootPane, "¡Departamento creado!");
                txtNombre.setText("");
                break;
            case "Proyecto":
                Proyecto proyecto = new Proyecto(txtNombre.getText(), datePickerCreacion.getDate(), 
                Empresa.getInstance().buscarDepartamento(comboDepartamento.getSelectedItem().toString()));
                Empresa.getInstance().addProyecto(proyecto);
                JOptionPane.showMessageDialog(rootPane, "¡Proyecto creado!");
                txtNombre.setText("");
                datePickerCreacion.setDate(null);
                break;
            case "Recurso":
                Recursos recurso = new Recursos(txtNombre.getText());
                Empresa.getInstance().addRecurso(recurso);
                JOptionPane.showMessageDialog(rootPane, "¡Recurso creado!");
                txtNombre.setText("");
                break;
        }
    }//GEN-LAST:event_btnCrearObjetosActionPerformed

    private void btnCostoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoProyectoActionPerformed
        ArrayList<Proyecto> proyectos = Empresa.getInstance().getListaProyectos();
        DefaultListModel model = new DefaultListModel();
//        for(Proyecto p: proyectos){
//            
//        }
        jListados.setModel(model);
    }//GEN-LAST:event_btnCostoProyectoActionPerformed

    private void btnCostoProyectoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostoProyectoPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCostoProyectoPersonalActionPerformed

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCostoProyecto;
    private javax.swing.JButton btnCostoProyectoPersonal;
    private javax.swing.JButton btnCostoProyectoPersonal1;
    private javax.swing.JButton btnCostoProyectoPersonal3;
    private javax.swing.JButton btnCrearObjetos;
    private javax.swing.JButton btnListarProyectos;
    private javax.swing.JButton btnPersonalConProyecto;
    private javax.swing.JButton btnPersonalDepa;
    private javax.swing.JButton btnProyectosAtraso;
    private javax.swing.JButton btnRecursosLibres;
    private javax.swing.JComboBox<String> comboActividades;
    private javax.swing.JComboBox<String> comboCreacion;
    private javax.swing.JComboBox<String> comboDepartamento;
    private org.jdesktop.swingx.JXDatePicker datePickerCreacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCedula;
    private javax.swing.JLabel labelDepa;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JTabbedPane tabListados;
    private javax.swing.JTextArea textActividades;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
