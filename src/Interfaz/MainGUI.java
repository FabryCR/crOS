/*
Autor: Fabrizio Salas Álvarez
 */
package Interfaz;

import estructuras.Cola;
import estructuras.Cola_Vector;
import estructuras.Pila;
import estructuras.ListaES;
import estructuras.ListaSC;
import estructuras.ListaDC;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class MainGUI extends javax.swing.JFrame {

    Pila p1 = new Pila();
    Cola c1 = new Cola();
    ListaES ES = new ListaES();
    ListaSC SC = new ListaSC();
    ListaDC DC = new ListaDC();
    Cola_Vector CV = new Cola_Vector();

    public MainGUI() {
        initComponents();
    }

    //Métodos de las Estructuras de Datos
    private void Pila() {

        String nombre;
        int cedula;
        char UIsexo = '\0';
        int edad;
        String nacionalidad;
        String ubicacion;
        String detalles;

        String provincia = UIadminAddComboProv.getSelectedItem().toString();
        String canton = UIadminAddComboCant.getSelectedItem().toString();

        nombre = UIadminAddNombre.getText();
        cedula = Integer.parseInt(UIadminAddCedula.getText());
        edad = Integer.parseInt(UIadminAddEdad.getText());
        nacionalidad = UIadminAddNacionalidad.getText();
        ubicacion = canton + ", " + provincia;
        detalles = UIadminAddDescrip.getText();
        if (UIadminAddradbtnMasculino.isSelected()) {
            UIsexo = 'M';
        } else if (UIadminAddradbtnFemenino.isSelected()) {
            UIsexo = 'F';
        }
        //Se envian los parametros al metodo apilar()
        p1.apilar(nombre, cedula, UIsexo, edad, nacionalidad, ubicacion, detalles);
        JOptionPane.showMessageDialog(null, "Se ha añadido el reporte satisfactoriamente.", "Reporte Enviado", JOptionPane.INFORMATION_MESSAGE);

        //Se limpian los campos y pasa a la ventana anterior
        UIadminAddNombre.setText("");
        UIadminAddCedula.setText("");
        UIadminAddEdad.setText("");
        UIadminAddNacionalidad.setText("");
        UIadminAddDescrip.setText("");
        UIhacerRepComboProv.setSelectedIndex(0);
        Paneles.removeAll();
        Paneles.add(adminPanel);
        Paneles.repaint();
        Paneles.revalidate();

    }

    private void ListaES() {
        //Reportes de Heredia
        String apariencia;
        String delito;
        String ubicacion;
        char UIsexo = '\0';

        String provincia = UIhacerRepComboProv.getSelectedItem().toString();
        String canton = UIhacerRepComboCant.getSelectedItem().toString();
        apariencia = UIhacerRepApariencia.getText();
        delito = UIhacerRepDelito.getText();
        ubicacion = canton + ", " + provincia;
        if (UIradbtnMasculino.isSelected()) {
            UIsexo = 'M';
        } else if (UIradbtnFemenino.isSelected()) {
            UIsexo = 'F';
        }

        //Se envian los parametros al metodo agregarES()
        ES.agregarES(UIsexo, apariencia, delito, ubicacion);
        JOptionPane.showMessageDialog(null, "Se ha enviado el reporte, Gracias", "Reporte Enviado", JOptionPane.INFORMATION_MESSAGE);

        //Se limpian los campos y pasa a la ventana anterior
        UIhacerRepDelito.setText("");
        UIhacerRepApariencia.setText("");
        UIhacerRepComboProv.setSelectedIndex(0);
        Paneles.removeAll();
        Paneles.add(userPanel);
        Paneles.repaint();
        Paneles.revalidate();

    }

    private void ListaSC() {
        //Reportes de Guanacaste
        String apariencia;
        String delito;
        String ubicacion;
        char UIsexo = '\0';

        String provincia = UIhacerRepComboProv.getSelectedItem().toString();
        String canton = UIhacerRepComboCant.getSelectedItem().toString();
        apariencia = UIhacerRepApariencia.getText();
        delito = UIhacerRepDelito.getText();
        ubicacion = canton + ", " + provincia;
        if (UIradbtnMasculino.isSelected()) {
            UIsexo = 'M';
        } else if (UIradbtnFemenino.isSelected()) {
            UIsexo = 'F';
        }

        //Se envian los parametros al metodo agregarSC()
        SC.agregarSC(UIsexo, apariencia, delito, ubicacion);
        JOptionPane.showMessageDialog(null, "Se ha enviado el reporte, Gracias", "Reporte Enviado", JOptionPane.INFORMATION_MESSAGE);

        //Se limpian los campos y pasa a la ventana anterior
        UIhacerRepDelito.setText("");
        UIhacerRepApariencia.setText("");
        UIhacerRepComboProv.setSelectedIndex(0);
        Paneles.removeAll();
        Paneles.add(userPanel);
        Paneles.repaint();
        Paneles.revalidate();
    }

    private void ListaDC() {
        //Reportes de Puntarenas
        String apariencia;
        String delito;
        String ubicacion;
        char UIsexo = '\0';

        String provincia = UIhacerRepComboProv.getSelectedItem().toString();
        String canton = UIhacerRepComboCant.getSelectedItem().toString();
        apariencia = UIhacerRepApariencia.getText();
        delito = UIhacerRepDelito.getText();
        ubicacion = canton + ", " + provincia;
        if (UIradbtnMasculino.isSelected()) {
            UIsexo = 'M';
        } else if (UIradbtnFemenino.isSelected()) {
            UIsexo = 'F';
        }

        //Se envian los parametros al metodo agregarDC()
        DC.agregarDC(UIsexo, apariencia, delito, ubicacion);
        JOptionPane.showMessageDialog(null, "Se ha enviado el reporte, Gracias", "Reporte Enviado", JOptionPane.INFORMATION_MESSAGE);

        //Se limpian los campos y pasa a la ventana anterior
        UIhacerRepDelito.setText("");
        UIhacerRepApariencia.setText("");
        UIhacerRepComboProv.setSelectedIndex(0);
        Paneles.removeAll();
        Paneles.add(userPanel);
        Paneles.repaint();
        Paneles.revalidate();
    }

    private void ColaVector() {
        //Reportes de Limón
        String apariencia;
        String delito;
        String ubicacion;
        char UIsexo = '\0';

        String provincia = UIhacerRepComboProv.getSelectedItem().toString();
        String canton = UIhacerRepComboCant.getSelectedItem().toString();
        apariencia = UIhacerRepApariencia.getText();
        delito = UIhacerRepDelito.getText();
        ubicacion = canton + ", " + provincia;
        if (UIradbtnMasculino.isSelected()) {
            UIsexo = 'M';
        } else if (UIradbtnFemenino.isSelected()) {
            UIsexo = 'F';
        }

        //Se envian los parametros al metodo encolar de la Cola_Vector()
        CV.encolar(UIsexo, apariencia, delito, ubicacion);
        JOptionPane.showMessageDialog(null, "Se ha enviado el reporte, Gracias", "Reporte Enviado", JOptionPane.INFORMATION_MESSAGE);

        //Se limpian los campos y pasa a la ventana anterior
        UIhacerRepDelito.setText("");
        UIhacerRepApariencia.setText("");
        UIhacerRepComboProv.setSelectedIndex(0);
        Paneles.removeAll();
        Paneles.add(userPanel);
        Paneles.repaint();
        Paneles.revalidate();

    }

    private void Cola() {
        //Reportes de SJ/AL/CART
        String apariencia;
        String delito;
        String ubicacion;
        char UIsexo = '\0';

        String provincia = UIhacerRepComboProv.getSelectedItem().toString();
        String canton = UIhacerRepComboCant.getSelectedItem().toString();
        apariencia = UIhacerRepApariencia.getText();
        delito = UIhacerRepDelito.getText();
        ubicacion = canton + ", " + provincia;
        if (UIradbtnMasculino.isSelected()) {
            UIsexo = 'M';
        } else if (UIradbtnFemenino.isSelected()) {
            UIsexo = 'F';
        }

        //Se envian los parametros al metodo encolar()
        c1.encolar(UIsexo, apariencia, delito, ubicacion);
        JOptionPane.showMessageDialog(null, "Se ha enviado el reporte, Gracias", "Reporte Enviado", JOptionPane.INFORMATION_MESSAGE);

        //Se limpian los campos y pasa a la ventana anterior
        UIhacerRepDelito.setText("");
        UIhacerRepApariencia.setText("");
        UIhacerRepComboProv.setSelectedIndex(0);
        Paneles.removeAll();
        Paneles.add(userPanel);
        Paneles.repaint();
        Paneles.revalidate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reporteSexo = new javax.swing.ButtonGroup();
        adminSexo = new javax.swing.ButtonGroup();
        Paneles = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        UImainbtnComprobar = new javax.swing.JButton();
        UImainbtnModoAdmin = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        UIuserbtnMenu = new javax.swing.JButton();
        UIuserbtnVerRep = new javax.swing.JButton();
        UIuserbtnRealizarRep = new javax.swing.JButton();
        logo2 = new javax.swing.JLabel();
        hacerReportePanel = new javax.swing.JPanel();
        UIhacerRepbtnEnviar = new javax.swing.JButton();
        UIhacerRepComboProv = new javax.swing.JComboBox<>();
        UIhacerRepComboCant = new javax.swing.JComboBox<>();
        UIhacerRepbtnVolver = new javax.swing.JButton();
        UIradbtnMasculino = new javax.swing.JRadioButton();
        UIradbtnFemenino = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        UIhacerRepApariencia = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        UIhacerRepDelito = new javax.swing.JTextArea();
        txtTitulo = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        verReportesPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UIverRepComboProv = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        UIverRepVerReportes = new javax.swing.JTextArea();
        UIverRepbtnVolver = new javax.swing.JButton();
        UIverRepbtnVerReport = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        UILoginUser = new javax.swing.JTextField();
        UILoginpass = new javax.swing.JPasswordField();
        UILoginbtnSignIn = new javax.swing.JButton();
        UILoginbtnCancelar = new javax.swing.JButton();
        adminPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        UIadminPantallaReportes = new javax.swing.JTextArea();
        UIadminbtnNueva = new javax.swing.JButton();
        UIadminbtnEliminar = new javax.swing.JButton();
        UIadminbtnVerReportes = new javax.swing.JButton();
        UIadminbtnVolver = new javax.swing.JButton();
        UIadminComboProv = new javax.swing.JComboBox<>();
        adminAddPanel = new javax.swing.JPanel();
        UIadminAddradbtnMasculino = new javax.swing.JRadioButton();
        UIadminAddradbtnFemenino = new javax.swing.JRadioButton();
        UIadminAddbtnConfirmar = new javax.swing.JButton();
        UIadminAddbtnCancelar = new javax.swing.JButton();
        UIadminAddNombre = new javax.swing.JTextField();
        UIadminAddCedula = new javax.swing.JTextField();
        UIadminAddEdad = new javax.swing.JTextField();
        UIadminAddNacionalidad = new javax.swing.JTextField();
        UIadminAddComboProv = new javax.swing.JComboBox<>();
        UIadminAddComboCant = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        UIadminAddDescrip = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("crOS");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
        setResizable(false);
        setSize(new java.awt.Dimension(1160, 620));

        Paneles.setBackground(new java.awt.Color(0, 0, 0));
        Paneles.setForeground(new java.awt.Color(255, 255, 255));
        Paneles.setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        UImainbtnComprobar.setBackground(new java.awt.Color(255, 255, 255));
        UImainbtnComprobar.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        UImainbtnComprobar.setForeground(new java.awt.Color(0, 153, 153));
        UImainbtnComprobar.setText("COMPROBAR MI ALREDEDOR");
        UImainbtnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UImainbtnComprobarActionPerformed(evt);
            }
        });

        UImainbtnModoAdmin.setBackground(new java.awt.Color(255, 255, 255));
        UImainbtnModoAdmin.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UImainbtnModoAdmin.setForeground(new java.awt.Color(0, 153, 153));
        UImainbtnModoAdmin.setText("MODO ADMINISTRADOR");
        UImainbtnModoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UImainbtnModoAdminActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/logocrOS.png"))); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(UImainbtnModoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(430, 430, 430))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(UImainbtnComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UImainbtnComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(UImainbtnModoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Paneles.add(mainPanel, "card6");

        userPanel.setBackground(new java.awt.Color(0, 0, 0));

        UIuserbtnMenu.setBackground(new java.awt.Color(255, 255, 255));
        UIuserbtnMenu.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        UIuserbtnMenu.setForeground(new java.awt.Color(0, 153, 153));
        UIuserbtnMenu.setText("MENÚ PRINCIPAL");
        UIuserbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIuserbtnMenuActionPerformed(evt);
            }
        });

        UIuserbtnVerRep.setBackground(new java.awt.Color(255, 255, 255));
        UIuserbtnVerRep.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        UIuserbtnVerRep.setForeground(new java.awt.Color(0, 153, 153));
        UIuserbtnVerRep.setText("VER REPORTES EN MI ZONA");
        UIuserbtnVerRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIuserbtnVerRepActionPerformed(evt);
            }
        });

        UIuserbtnRealizarRep.setBackground(new java.awt.Color(255, 255, 255));
        UIuserbtnRealizarRep.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        UIuserbtnRealizarRep.setForeground(new java.awt.Color(0, 153, 153));
        UIuserbtnRealizarRep.setText("REALIZAR REPORTE");
        UIuserbtnRealizarRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIuserbtnRealizarRepActionPerformed(evt);
            }
        });

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/logocrOS.png"))); // NOI18N

        javax.swing.GroupLayout userPanelLayout = new javax.swing.GroupLayout(userPanel);
        userPanel.setLayout(userPanelLayout);
        userPanelLayout.setHorizontalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(UIuserbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(logo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(UIuserbtnVerRep, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(UIuserbtnRealizarRep, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        userPanelLayout.setVerticalGroup(
            userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userPanelLayout.createSequentialGroup()
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(UIuserbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(userPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIuserbtnVerRep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIuserbtnRealizarRep, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121))
        );

        Paneles.add(userPanel, "card3");

        hacerReportePanel.setBackground(new java.awt.Color(0, 0, 0));

        UIhacerRepbtnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        UIhacerRepbtnEnviar.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        UIhacerRepbtnEnviar.setForeground(new java.awt.Color(0, 153, 153));
        UIhacerRepbtnEnviar.setText("ENVIAR REPORTE");
        UIhacerRepbtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIhacerRepbtnEnviarActionPerformed(evt);
            }
        });

        UIhacerRepComboProv.setBackground(new java.awt.Color(0, 102, 102));
        UIhacerRepComboProv.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIhacerRepComboProv.setForeground(new java.awt.Color(255, 255, 255));
        UIhacerRepComboProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar Provincia-", "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        UIhacerRepComboProv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                UIhacerRepComboProvItemStateChanged(evt);
            }
        });

        UIhacerRepComboCant.setBackground(new java.awt.Color(0, 102, 102));
        UIhacerRepComboCant.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIhacerRepComboCant.setForeground(new java.awt.Color(255, 255, 255));
        UIhacerRepComboCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        UIhacerRepbtnVolver.setBackground(new java.awt.Color(255, 255, 255));
        UIhacerRepbtnVolver.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        UIhacerRepbtnVolver.setForeground(new java.awt.Color(0, 153, 153));
        UIhacerRepbtnVolver.setText("Volver");
        UIhacerRepbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIhacerRepbtnVolverActionPerformed(evt);
            }
        });

        UIradbtnMasculino.setBackground(new java.awt.Color(0, 102, 102));
        reporteSexo.add(UIradbtnMasculino);
        UIradbtnMasculino.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIradbtnMasculino.setForeground(new java.awt.Color(255, 255, 255));
        UIradbtnMasculino.setSelected(true);
        UIradbtnMasculino.setText("Masculino");

        UIradbtnFemenino.setBackground(new java.awt.Color(0, 102, 102));
        reporteSexo.add(UIradbtnFemenino);
        UIradbtnFemenino.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIradbtnFemenino.setForeground(new java.awt.Color(255, 255, 255));
        UIradbtnFemenino.setText("Femenino");

        UIhacerRepApariencia.setBackground(new java.awt.Color(0, 102, 102));
        UIhacerRepApariencia.setColumns(20);
        UIhacerRepApariencia.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIhacerRepApariencia.setForeground(new java.awt.Color(255, 255, 255));
        UIhacerRepApariencia.setRows(5);
        jScrollPane2.setViewportView(UIhacerRepApariencia);

        UIhacerRepDelito.setBackground(new java.awt.Color(0, 102, 102));
        UIhacerRepDelito.setColumns(20);
        UIhacerRepDelito.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIhacerRepDelito.setForeground(new java.awt.Color(255, 255, 255));
        UIhacerRepDelito.setRows(5);
        jScrollPane3.setViewportView(UIhacerRepDelito);

        txtTitulo.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 153, 153));
        txtTitulo.setText("HACER REPORTE");

        txt1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setText("Apariencia");

        txt2.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setText("Delito / Detalles");

        txt3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setText("Indique su ubicación actual");

        txt4.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setText("Sexo");

        javax.swing.GroupLayout hacerReportePanelLayout = new javax.swing.GroupLayout(hacerReportePanel);
        hacerReportePanel.setLayout(hacerReportePanelLayout);
        hacerReportePanelLayout.setHorizontalGroup(
            hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hacerReportePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(UIhacerRepbtnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(hacerReportePanelLayout.createSequentialGroup()
                .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(UIhacerRepbtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(txtTitulo))
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txt1))
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt4)
                            .addComponent(UIradbtnMasculino)))
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(UIradbtnFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txt3))
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UIhacerRepComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UIhacerRepComboCant, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(292, 455, Short.MAX_VALUE))
        );
        hacerReportePanelLayout.setVerticalGroup(
            hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hacerReportePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIhacerRepbtnVolver)
                    .addComponent(txtTitulo))
                .addGap(26, 26, 26)
                .addComponent(txt1)
                .addGap(4, 4, 4)
                .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txt4)
                        .addGap(14, 14, 14)
                        .addComponent(UIradbtnMasculino)))
                .addGap(2, 2, 2)
                .addGroup(hacerReportePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hacerReportePanelLayout.createSequentialGroup()
                        .addComponent(txt2)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UIradbtnFemenino))
                .addGap(20, 20, 20)
                .addComponent(txt3)
                .addGap(4, 4, 4)
                .addComponent(UIhacerRepComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(UIhacerRepComboCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(UIhacerRepbtnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        Paneles.add(hacerReportePanel, "card4");

        verReportesPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("REPORTES");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione Su Zona");

        UIverRepComboProv.setBackground(new java.awt.Color(0, 102, 102));
        UIverRepComboProv.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIverRepComboProv.setForeground(new java.awt.Color(255, 255, 255));
        UIverRepComboProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San José | Alajuela | Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón", "Reportes Generales" }));

        UIverRepVerReportes.setEditable(false);
        UIverRepVerReportes.setColumns(20);
        UIverRepVerReportes.setRows(5);
        jScrollPane4.setViewportView(UIverRepVerReportes);

        UIverRepbtnVolver.setBackground(new java.awt.Color(255, 255, 255));
        UIverRepbtnVolver.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIverRepbtnVolver.setForeground(new java.awt.Color(0, 153, 153));
        UIverRepbtnVolver.setText("VOLVER");
        UIverRepbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIverRepbtnVolverActionPerformed(evt);
            }
        });

        UIverRepbtnVerReport.setBackground(new java.awt.Color(255, 255, 255));
        UIverRepbtnVerReport.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        UIverRepbtnVerReport.setForeground(new java.awt.Color(0, 153, 153));
        UIverRepbtnVerReport.setText("VER REPORTES");
        UIverRepbtnVerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIverRepbtnVerReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout verReportesPanelLayout = new javax.swing.GroupLayout(verReportesPanel);
        verReportesPanel.setLayout(verReportesPanelLayout);
        verReportesPanelLayout.setHorizontalGroup(
            verReportesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verReportesPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(UIverRepbtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(verReportesPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(verReportesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(verReportesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 1047, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, verReportesPanelLayout.createSequentialGroup()
                        .addComponent(UIverRepComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UIverRepbtnVerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(verReportesPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        verReportesPanelLayout.setVerticalGroup(
            verReportesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verReportesPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(verReportesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIverRepbtnVolver)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(verReportesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIverRepComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIverRepbtnVerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        Paneles.add(verReportesPanel, "card5");

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("INICIO DE SESIÓN");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Digite su usuario y contraseña para verificar su indentidad");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Usuario");

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña");

        UILoginUser.setBackground(new java.awt.Color(0, 102, 102));
        UILoginUser.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UILoginUser.setForeground(new java.awt.Color(255, 255, 255));
        UILoginUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UILoginUserKeyPressed(evt);
            }
        });

        UILoginpass.setBackground(new java.awt.Color(0, 102, 102));
        UILoginpass.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UILoginpass.setForeground(new java.awt.Color(255, 255, 255));
        UILoginpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UILoginpassKeyPressed(evt);
            }
        });

        UILoginbtnSignIn.setBackground(new java.awt.Color(255, 255, 255));
        UILoginbtnSignIn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UILoginbtnSignIn.setForeground(new java.awt.Color(0, 153, 153));
        UILoginbtnSignIn.setText("INICIAR SESIÓN");
        UILoginbtnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UILoginbtnSignInActionPerformed(evt);
            }
        });

        UILoginbtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        UILoginbtnCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UILoginbtnCancelar.setForeground(new java.awt.Color(0, 153, 153));
        UILoginbtnCancelar.setText("CANCELAR");
        UILoginbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UILoginbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel13))
                    .addComponent(UILoginbtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UILoginUser)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(UILoginpass, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(UILoginbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(412, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel13)
                .addGap(53, 53, 53)
                .addComponent(jLabel10)
                .addGap(52, 52, 52)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UILoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UILoginpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(UILoginbtnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UILoginbtnCancelar)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        Paneles.add(loginPanel, "card7");

        adminPanel.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("ADMINISTRAR LISTA");

        UIadminPantallaReportes.setEditable(false);
        UIadminPantallaReportes.setColumns(20);
        UIadminPantallaReportes.setRows(5);
        jScrollPane8.setViewportView(UIadminPantallaReportes);

        UIadminbtnNueva.setBackground(new java.awt.Color(255, 255, 255));
        UIadminbtnNueva.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminbtnNueva.setForeground(new java.awt.Color(0, 153, 153));
        UIadminbtnNueva.setText("AÑADIR NUEVA ENTRADA");
        UIadminbtnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIadminbtnNuevaActionPerformed(evt);
            }
        });

        UIadminbtnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        UIadminbtnEliminar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminbtnEliminar.setForeground(new java.awt.Color(0, 153, 153));
        UIadminbtnEliminar.setText("ELIMINAR ÚLTIMA ENTRADA");
        UIadminbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIadminbtnEliminarActionPerformed(evt);
            }
        });

        UIadminbtnVerReportes.setBackground(new java.awt.Color(255, 255, 255));
        UIadminbtnVerReportes.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminbtnVerReportes.setForeground(new java.awt.Color(0, 153, 153));
        UIadminbtnVerReportes.setText("VER REPORTES");
        UIadminbtnVerReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIadminbtnVerReportesActionPerformed(evt);
            }
        });

        UIadminbtnVolver.setBackground(new java.awt.Color(255, 255, 255));
        UIadminbtnVolver.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminbtnVolver.setForeground(new java.awt.Color(0, 153, 153));
        UIadminbtnVolver.setText("VOLVER");
        UIadminbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIadminbtnVolverActionPerformed(evt);
            }
        });

        UIadminComboProv.setBackground(new java.awt.Color(0, 102, 102));
        UIadminComboProv.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminComboProv.setForeground(new java.awt.Color(255, 255, 255));
        UIadminComboProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San José | Alajuela | Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón", "Reportes Generales" }));

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(UIadminbtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325)
                .addComponent(jLabel9)
                .addGap(24, 497, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(UIadminbtnNueva, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(UIadminbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(591, 591, 591)
                        .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UIadminbtnVerReportes, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(UIadminComboProv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UIadminbtnVolver)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UIadminbtnNueva)
                    .addComponent(UIadminbtnVerReportes))
                .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UIadminbtnEliminar))
                    .addGroup(adminPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(UIadminComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
        );

        Paneles.add(adminPanel, "card6");

        adminAddPanel.setBackground(new java.awt.Color(0, 0, 0));

        UIadminAddradbtnMasculino.setBackground(new java.awt.Color(0, 102, 102));
        adminSexo.add(UIadminAddradbtnMasculino);
        UIadminAddradbtnMasculino.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminAddradbtnMasculino.setForeground(new java.awt.Color(255, 255, 255));
        UIadminAddradbtnMasculino.setSelected(true);
        UIadminAddradbtnMasculino.setText("Masculino");

        UIadminAddradbtnFemenino.setBackground(new java.awt.Color(0, 102, 102));
        adminSexo.add(UIadminAddradbtnFemenino);
        UIadminAddradbtnFemenino.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminAddradbtnFemenino.setForeground(new java.awt.Color(255, 255, 255));
        UIadminAddradbtnFemenino.setText("Femenino");

        UIadminAddbtnConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        UIadminAddbtnConfirmar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminAddbtnConfirmar.setForeground(new java.awt.Color(0, 153, 153));
        UIadminAddbtnConfirmar.setText("CONFIRMAR");
        UIadminAddbtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIadminAddbtnConfirmarActionPerformed(evt);
            }
        });

        UIadminAddbtnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        UIadminAddbtnCancelar.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminAddbtnCancelar.setForeground(new java.awt.Color(0, 153, 153));
        UIadminAddbtnCancelar.setText("CANCELAR");
        UIadminAddbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UIadminAddbtnCancelarActionPerformed(evt);
            }
        });

        UIadminAddNombre.setBackground(new java.awt.Color(0, 102, 102));
        UIadminAddNombre.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIadminAddNombre.setForeground(new java.awt.Color(255, 255, 255));

        UIadminAddCedula.setBackground(new java.awt.Color(0, 102, 102));
        UIadminAddCedula.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIadminAddCedula.setForeground(new java.awt.Color(255, 255, 255));

        UIadminAddEdad.setBackground(new java.awt.Color(0, 102, 102));
        UIadminAddEdad.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIadminAddEdad.setForeground(new java.awt.Color(255, 255, 255));

        UIadminAddNacionalidad.setBackground(new java.awt.Color(0, 102, 102));
        UIadminAddNacionalidad.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIadminAddNacionalidad.setForeground(new java.awt.Color(255, 255, 255));

        UIadminAddComboProv.setBackground(new java.awt.Color(0, 102, 102));
        UIadminAddComboProv.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminAddComboProv.setForeground(new java.awt.Color(255, 255, 255));
        UIadminAddComboProv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar Provincia-", "San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón" }));
        UIadminAddComboProv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                UIadminAddComboProvItemStateChanged(evt);
            }
        });

        UIadminAddComboCant.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        UIadminAddComboCant.setForeground(new java.awt.Color(255, 255, 255));
        UIadminAddComboCant.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        UIadminAddDescrip.setBackground(new java.awt.Color(0, 102, 102));
        UIadminAddDescrip.setColumns(20);
        UIadminAddDescrip.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        UIadminAddDescrip.setForeground(new java.awt.Color(255, 255, 255));
        UIadminAddDescrip.setRows(5);
        jScrollPane7.setViewportView(UIadminAddDescrip);

        jLabel40.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Última Ubicación");

        jLabel33.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Nombre");

        jLabel34.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Sexo");

        jLabel36.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Edad");

        jLabel37.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Nacionalidad");

        jLabel38.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Cédula");

        jLabel39.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Detalles");

        javax.swing.GroupLayout adminAddPanelLayout = new javax.swing.GroupLayout(adminAddPanel);
        adminAddPanel.setLayout(adminAddPanelLayout);
        adminAddPanelLayout.setHorizontalGroup(
            adminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAddPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(adminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UIadminAddComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UIadminAddComboCant, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(UIadminAddNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(UIadminAddCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(UIadminAddEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jLabel34)
                    .addComponent(UIadminAddradbtnMasculino)
                    .addComponent(UIadminAddradbtnFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(UIadminAddNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(adminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(558, 558, 558))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminAddPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UIadminAddbtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UIadminAddbtnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
                .addGap(146, 146, 146))
        );
        adminAddPanelLayout.setVerticalGroup(
            adminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAddPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel33)
                .addGap(4, 4, 4)
                .addComponent(UIadminAddNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel38)
                .addGap(4, 4, 4)
                .addComponent(UIadminAddCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel36)
                .addGap(4, 4, 4)
                .addComponent(UIadminAddEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel37)
                .addGap(4, 4, 4)
                .addComponent(UIadminAddNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminAddPanelLayout.createSequentialGroup()
                        .addComponent(UIadminAddradbtnMasculino)
                        .addGap(2, 2, 2)
                        .addComponent(UIadminAddradbtnFemenino)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UIadminAddComboProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(UIadminAddComboCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(UIadminAddbtnConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UIadminAddbtnCancelar)
                .addGap(30, 30, 30))
        );

        Paneles.add(adminAddPanel, "card10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Paneles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Main Panel
	private void UImainbtnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UImainbtnComprobarActionPerformed
            // TODO add your handling code here:
            //Botón que pasa a la siguiente ventana
            Paneles.removeAll();
            Paneles.add(userPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UImainbtnComprobarActionPerformed

	private void UImainbtnModoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UImainbtnModoAdminActionPerformed
            // TODO add your handling code here:
            //Botón que pasa a la siguiente ventana
            Paneles.removeAll();
            Paneles.add(loginPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UImainbtnModoAdminActionPerformed

    // User Panel

	private void UIuserbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIuserbtnMenuActionPerformed
            // TODO add your handling code here:
            //Botón que pasa a la siguiente ventana
            Paneles.removeAll();
            Paneles.add(mainPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UIuserbtnMenuActionPerformed

	private void UIuserbtnVerRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIuserbtnVerRepActionPerformed
            // TODO add your handling code here:
            //Botón que pasa a la siguiente ventana
            Paneles.removeAll();
            Paneles.add(verReportesPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UIuserbtnVerRepActionPerformed

	private void UIuserbtnRealizarRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIuserbtnRealizarRepActionPerformed
            // TODO add your handling code here:
            //Botón que pasa a la siguiente ventana
            Paneles.removeAll();
            Paneles.add(hacerReportePanel);
            Paneles.repaint();
            Paneles.revalidate();

            //Crea el modelo para el ComboBox de Cantón y lo desactiva, esto para que sea activado hasta que una provincia se selecciona 
            UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-"}));
            UIhacerRepComboCant.setEnabled(false);
	}//GEN-LAST:event_UIuserbtnRealizarRepActionPerformed

    // Hacer Reporte Panel

	private void UIhacerRepbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIhacerRepbtnVolverActionPerformed
            // TODO add your handling code here:
            //Botón que pasa a la siguiente ventana y pregunta si quiere cancela para no perder progreso
            int opc = JOptionPane.showConfirmDialog(null, "¿Desea cancelar? Perderá los datos no guardados", "Cancelar", JOptionPane.YES_NO_OPTION);
            if (opc == 0) {
                //Si la respuesta es si, limpia los campos y pasa a la siguiente ventana
                UIhacerRepDelito.setText("");
                UIhacerRepApariencia.setText("");
                UIhacerRepComboProv.setSelectedIndex(0);
                Paneles.removeAll();
                Paneles.add(userPanel);
                Paneles.repaint();
                Paneles.revalidate();
            }
	}//GEN-LAST:event_UIhacerRepbtnVolverActionPerformed

	private void UIhacerRepbtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIhacerRepbtnEnviarActionPerformed
            // TODO add your handling code here:

            //Al enviar el reporte, depende de la provincia se añade a una estructura distinta, como motivo de poder hacer uso de varias de estas
            //San José, Alajuela, Cartago: Cola | Heredia: Lista Enlazada Simple | Guanacaste: Lista Simple Circular | Puntarenas: Lista Doble Circular | Limón: Cola2 y Vector
            //Según la provincia, se llama al método correspondiente que tiene todo el código para insertar los datos
            int provincia = UIhacerRepComboProv.getSelectedIndex();
            String prov = UIhacerRepComboProv.getSelectedItem().toString();
            String cant = UIhacerRepComboCant.getSelectedItem().toString();

            switch (provincia) {
                case 1:
                case 2:
                case 3:
                    //Si no se rellenan los datos suficientes no se procede con la ejecución y se le informa al usuario
                    if (UIhacerRepApariencia.getText().isEmpty() || UIhacerRepDelito.getText().isEmpty()
                            || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                        JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        Cola();
                    }
                    break;
                case 4:
                    if (UIhacerRepApariencia.getText().isEmpty() || UIhacerRepDelito.getText().isEmpty()
                            || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                        JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        ListaES();
                    }
                    break;
                case 5:
                    if (UIhacerRepApariencia.getText().isEmpty() || UIhacerRepDelito.getText().isEmpty()
                            || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                        JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        ListaSC();
                    }
                    break;
                case 6:
                    if (UIhacerRepApariencia.getText().isEmpty() || UIhacerRepDelito.getText().isEmpty()
                            || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                        JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        ListaDC();
                    }
                    break;
                case 7:
                    if (UIhacerRepApariencia.getText().isEmpty() || UIhacerRepDelito.getText().isEmpty()
                            || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                        JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        ColaVector();
                    }
                    break;
                default:
                    if (UIhacerRepApariencia.getText().isEmpty() || UIhacerRepDelito.getText().isEmpty()
                            || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                        JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            }

	}//GEN-LAST:event_UIhacerRepbtnEnviarActionPerformed

	private void UIhacerRepComboProvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_UIhacerRepComboProvItemStateChanged
            // TODO add your handling code here:
            //Aquí se selecciona el contenido que va a tener el modelo del ComboBox de Cantón, esto según la provincia seleccionada en el ComboBox de Provincia

            int provincia = UIhacerRepComboProv.getSelectedIndex();

            switch (provincia) {
                case 0:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-"}));
                    UIhacerRepComboCant.setSelectedIndex(0);
                    UIhacerRepComboCant.setEnabled(false);
                    break;
                case 1:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "San José", "Escazú", "Desamparados", "Puriscal", "Tarrazú", "Aserrí", "Mora", "Goicoechea",
                        "Santa Ana", "Alajuelita", "Vázquez de Coronado", "Acosta", "Tibás", "Moravia", "Montes de Oca", "Turrubares", "Dota", "Curridabat", "Pérez Zeledón", "León Cortés"}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
                case 2:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "San Carlos", "Upala", "Los Chiles", "San Ramón", "Guatuso", "Alajuela", "Río Cuarto", "Zarcero",
                        "Orotina", "Grecia", "Atenas", "Naranjo", "San Mateo", "Sarchí", "Poás"}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
                case 3:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Turrialba", "Paraíso", "Cartago", "Jiménez", "Oreamuno", "El Guarco", "Alvarado", "La Unión",}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
                case 4:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Barva", "Santa Bárbara", "San Rafael", "San Isidro", "Santo Domingo", "Belén",
                        "San Pablo", "Flores"}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
                case 5:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Liberia", "La Cruz", "Nicoya", "Santa Cruz", "Bagaces", "Cañas", "Abangares",
                        "Tilarán", "Carrillo", "Nandayure", "Hojancha"}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
                case 6:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Buenos Aires", "Osa", "Puntarenas", "Golfito", "Coto Brus", "Corredores", "Quepos",
                        "Parrita", "Garabito", "Montes de Oro", "Esparza"}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
                case 7:
                    UIhacerRepComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Talamanca", "Pococí", "Limón", "Siquirres", "Matina", "Limón", "Guácimo"}));
                    UIhacerRepComboCant.setEnabled(true);
                    break;
            }
	}//GEN-LAST:event_UIhacerRepComboProvItemStateChanged

	private void UIverRepbtnVerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIverRepbtnVerReportActionPerformed
            //En este método se muestran los reportes al presionar el botón
            UIverRepVerReportes.setText("");
            int provincia = UIverRepComboProv.getSelectedIndex();

            switch (provincia) {
                case 0:
                    //Mostrar Elementos Cola (SJ, AL, CART);
                    String reportesCola = c1.mostrarElementos();
                    UIverRepVerReportes.setText(reportesCola + "\n");
                    c1.reportes = "";
                    break;
                case 1:
                    //Mostrar Elementos Lista ES (Heredia)
                    String reportesES = ES.mostrarES();
                    UIverRepVerReportes.setText(reportesES + "\n");
                    ES.reportes = "";
                    break;
                case 2:
                    //Mostrar Elementos Lista SC (Guanacaste)
                    String reportesSC = SC.mostrarSC();
                    UIverRepVerReportes.setText(reportesSC + "\n");
                    SC.reportes = "";
                    break;
                case 3:
                    //Mostrar Elementos Lista DC (Puntarenas)
                    String reportesDC = DC.mostrarDC();
                    UIverRepVerReportes.setText(reportesDC + "\n");
                    DC.reportes = "";
                    break;
                case 4:
                    //Mostrar Elementos Cola_Vector (Limón)
                    String reportesCola2_Vector = CV.CopiaVector_y_Mostrar();
                    UIverRepVerReportes.setText(reportesCola2_Vector + "\n");
                    CV.reportes = "";
                    break;
                case 5:
                    //Mostrar Elementos Pila (Generales)
                    String reportesPila = p1.mostrarElementos();
                    UIverRepVerReportes.setText(reportesPila + "\n");
                    p1.reportes = "";
                    break;
            }
	}//GEN-LAST:event_UIverRepbtnVerReportActionPerformed

	private void UIverRepbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIverRepbtnVolverActionPerformed
            //Se limpian los campos y pasa a la siguiente ventana
            UIverRepVerReportes.setText("");
            Paneles.removeAll();
            Paneles.add(userPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UIverRepbtnVolverActionPerformed

    // Login Panel

	private void UILoginUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UILoginUserKeyPressed
            //Al presionar la tecla ENTER estando en el campo de usuario se presiona el botón de Inicio de Sesión

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                UILoginbtnSignIn.doClick();
            }

	}//GEN-LAST:event_UILoginUserKeyPressed

	private void UILoginbtnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UILoginbtnSignInActionPerformed
            //Cuando se presiona el botón de Iniciar Sesión se llama al método anterior

            String user = UILoginUser.getText();
            String pass = "";

            char[] encryptedpass = UILoginpass.getPassword();

            for (int i = 0; i < encryptedpass.length; i++) {
                pass += encryptedpass[i];
            }

            //Verificación de que ambos espacios sean rellenados
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Los espacios de usuario y contraseña no pueden estar vacíos", "Faltan Datos", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (pass.equals("admin") && user.equals("admin")) {
                    UILoginUser.setText("");
                    UILoginpass.setText("");
                    Paneles.removeAll();
                    Paneles.add(adminPanel);
                    Paneles.repaint();
                    Paneles.revalidate();
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña o Usuario Incorrecto, favor revisar los campos", "Datos Incorrectos", JOptionPane.ERROR_MESSAGE);
                    UILoginpass.setText("");
                }
            }
	}//GEN-LAST:event_UILoginbtnSignInActionPerformed

	private void UILoginpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UILoginpassKeyPressed
            //Al presionar la tecla ENTER estando en el campo de contraseña se presiona el botón de Inicio de Sesión
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                UILoginbtnSignIn.doClick();
            }


	}//GEN-LAST:event_UILoginpassKeyPressed

	private void UILoginbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UILoginbtnCancelarActionPerformed
            //Botón que limpia los campos y pasa a la siguiente ventana
            UILoginUser.setText("");
            UILoginpass.setText("");
            Paneles.removeAll();
            Paneles.add(mainPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UILoginbtnCancelarActionPerformed

    // Admin Panel

	private void UIadminbtnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIadminbtnNuevaActionPerformed
            //Botón que pasa a la siguiente ventana
            UIadminPantallaReportes.setText("");
            Paneles.removeAll();
            Paneles.add(adminAddPanel);
            Paneles.repaint();
            Paneles.revalidate();

            //Crea el modelo para el ComboBox de Cantón y lo desactiva, esto para que sea activado hasta que una provincia se selecciona 
            UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-"}));
            UIadminAddComboCant.setEnabled(false);
	}//GEN-LAST:event_UIadminbtnNuevaActionPerformed

	private void UIadminbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIadminbtnEliminarActionPerformed
            //Eliminar el último reporte general de la pila
            p1.desapilar();
            //Limpia la pantalla y muestra los datos actualizados
            UIadminPantallaReportes.setText("");
            String reportesPila = p1.mostrarElementos();
            UIadminPantallaReportes.setText(reportesPila + "\n");
            p1.reportes = "";
	}//GEN-LAST:event_UIadminbtnEliminarActionPerformed

	private void UIadminbtnVerReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIadminbtnVerReportesActionPerformed
            //Ver los reportes desde el Admin

            UIadminPantallaReportes.setText("");

            int provincia = UIadminComboProv.getSelectedIndex();
            switch (provincia) {
                case 0:
                    //Mostrar Elementos Cola (SJ, AL, CART);
                    String reportesCola = c1.mostrarElementos();
                    UIadminPantallaReportes.setText(reportesCola + "\n");
                    c1.reportes = "";
                    break;
                case 1:
                    //Mostrar Elementos Lista ES (Heredia)
                    String reportesES = ES.mostrarES();
                    UIadminPantallaReportes.setText(reportesES + "\n");
                    ES.reportes = "";
                    break;
                case 2:
                    //Mostrar Elementos Lista SC (Guanacaste)
                    String reportesSC = SC.mostrarSC();
                    UIadminPantallaReportes.setText(reportesSC + "\n");
                    SC.reportes = "";
                    break;
                case 3:
                    //Mostrar Elementos Lista DC (Puntarenas)
                    String reportesDC = DC.mostrarDC();
                    UIadminPantallaReportes.setText(reportesDC + "\n");
                    DC.reportes = "";
                    break;
                case 4:
                    //Mostrar Elementos Cola_Vector(Limón)
                    String reportesCola2_Vector = CV.CopiaVector_y_Mostrar();
                    UIadminPantallaReportes.setText(reportesCola2_Vector + "\n");
                    CV.reportes = "";
                    break;
                case 5:
                    //Mostrar Elementos Pila (Generales)
                    String reportesPila = p1.mostrarElementos();
                    UIadminPantallaReportes.setText(reportesPila + "\n");
                    p1.reportes = "";
                    break;
            }
	}//GEN-LAST:event_UIadminbtnVerReportesActionPerformed

	private void UIadminbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIadminbtnVolverActionPerformed
            //Botón que limpia los campos y pasa a la siguiente ventana
            UIadminPantallaReportes.setText("");
            Paneles.removeAll();
            Paneles.add(mainPanel);
            Paneles.repaint();
            Paneles.revalidate();
	}//GEN-LAST:event_UIadminbtnVolverActionPerformed

    //Admin Add Panel

	private void UIadminAddbtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIadminAddbtnConfirmarActionPerformed

            String prov = UIadminAddComboProv.getSelectedItem().toString();
            String cant = UIadminAddComboCant.getSelectedItem().toString();

            if (UIadminAddNombre.getText().isEmpty() || UIadminAddCedula.getText().isEmpty() || UIadminAddEdad.getText().isEmpty() || UIadminAddNacionalidad.getText().isEmpty()
                    || UIadminAddDescrip.getText().isEmpty() || prov.equals("-Seleccionar Provincia-") || cant.equals("-Seleccionar Cantón-")) {
                JOptionPane.showMessageDialog(null, "No pueden dejar campos vacíos", "Campos sin Rellenar", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //Aqui se añade a la Pila desde el admin para los reportes generales.....
                Pila();
            }
	}//GEN-LAST:event_UIadminAddbtnConfirmarActionPerformed

	private void UIadminAddbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UIadminAddbtnCancelarActionPerformed
            //Al seleccionar el botón de Cancelar primero se le pregunta al usuario si está seguro y al aceptar se cierra la ventana

            int opc = JOptionPane.showConfirmDialog(null, "¿Desea cancelar? Perderá los datos no guardados", "Cancelar", JOptionPane.YES_NO_OPTION);
            if (opc == 0) {

                UIadminAddNombre.setText("");
                UIadminAddCedula.setText("");
                UIadminAddEdad.setText("");
                UIadminAddNacionalidad.setText("");
                UIadminAddDescrip.setText("");
                UIadminAddComboProv.setSelectedIndex(0);

                Paneles.removeAll();
                Paneles.add(adminPanel);
                Paneles.repaint();
                Paneles.revalidate();
            }
	}//GEN-LAST:event_UIadminAddbtnCancelarActionPerformed

	private void UIadminAddComboProvItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_UIadminAddComboProvItemStateChanged
            //Aquí se selecciona el contenido que va a tener el modelo del ComboBox de Cantón, esto según la provincia seleccionada en el ComboBox de Provincia

            int provincia = UIadminAddComboProv.getSelectedIndex();

            switch (provincia) {
                case 0:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-"}));
                    UIadminAddComboCant.setSelectedIndex(0);
                    UIadminAddComboCant.setEnabled(false);
                    break;
                case 1:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "San José", "Escazú", "Desamparados", "Puriscal", "Tarrazú", "Aserrí", "Mora", "Goicoechea",
                        "Santa Ana", "Alajuelita", "Vázquez de Coronado", "Acosta", "Tibás", "Moravia", "Montes de Oca", "Turrubares", "Dota", "Curridabat", "Pérez Zeledón", "León Cortés"}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
                case 2:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "San Carlos", "Upala", "Los Chiles", "San Ramón", "Guatuso", "Alajuela", "Río Cuarto", "Zarcero",
                        "Orotina", "Grecia", "Atenas", "Naranjo", "San Mateo", "Sarchí", "Poás"}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
                case 3:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Turrialba", "Paraíso", "Cartago", "Jiménez", "Oreamuno", "El Guarco", "Alvarado", "La Unión",}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
                case 4:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Barva", "Santa Bárbara", "San Rafael", "San Isidro", "Santo Domingo", "Belén",
                        "San Pablo", "Flores"}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
                case 5:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Liberia", "La Cruz", "Nicoya", "Santa Cruz", "Bagaces", "Cañas", "Abangares",
                        "Tilarán", "Carrillo", "Nandayure", "Hojancha"}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
                case 6:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Buenos Aires", "Osa", "Puntarenas", "Golfito", "Coto Brus", "Corredores", "Quepos",
                        "Parrita", "Garabito", "Montes de Oro", "Esparza"}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
                case 7:
                    UIadminAddComboCant.setModel(new DefaultComboBoxModel<>(new String[]{"-Seleccionar Cantón-", "Talamanca", "Pococí", "Limón", "Siquirres", "Matina", "Limón", "Guácimo"}));
                    UIadminAddComboCant.setEnabled(true);
                    break;
            }
	}//GEN-LAST:event_UIadminAddComboProvItemStateChanged

    /**
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
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Paneles;
    private javax.swing.JTextField UILoginUser;
    private javax.swing.JButton UILoginbtnCancelar;
    private javax.swing.JButton UILoginbtnSignIn;
    private javax.swing.JPasswordField UILoginpass;
    private javax.swing.JTextField UIadminAddCedula;
    private javax.swing.JComboBox<String> UIadminAddComboCant;
    private javax.swing.JComboBox<String> UIadminAddComboProv;
    private javax.swing.JTextArea UIadminAddDescrip;
    private javax.swing.JTextField UIadminAddEdad;
    private javax.swing.JTextField UIadminAddNacionalidad;
    private javax.swing.JTextField UIadminAddNombre;
    private javax.swing.JButton UIadminAddbtnCancelar;
    private javax.swing.JButton UIadminAddbtnConfirmar;
    private javax.swing.JRadioButton UIadminAddradbtnFemenino;
    private javax.swing.JRadioButton UIadminAddradbtnMasculino;
    private javax.swing.JComboBox<String> UIadminComboProv;
    private javax.swing.JTextArea UIadminPantallaReportes;
    private javax.swing.JButton UIadminbtnEliminar;
    private javax.swing.JButton UIadminbtnNueva;
    private javax.swing.JButton UIadminbtnVerReportes;
    private javax.swing.JButton UIadminbtnVolver;
    private javax.swing.JTextArea UIhacerRepApariencia;
    private javax.swing.JComboBox<String> UIhacerRepComboCant;
    private javax.swing.JComboBox<String> UIhacerRepComboProv;
    private javax.swing.JTextArea UIhacerRepDelito;
    private javax.swing.JButton UIhacerRepbtnEnviar;
    private javax.swing.JButton UIhacerRepbtnVolver;
    private javax.swing.JButton UImainbtnComprobar;
    private javax.swing.JButton UImainbtnModoAdmin;
    private javax.swing.JRadioButton UIradbtnFemenino;
    private javax.swing.JRadioButton UIradbtnMasculino;
    private javax.swing.JButton UIuserbtnMenu;
    private javax.swing.JButton UIuserbtnRealizarRep;
    private javax.swing.JButton UIuserbtnVerRep;
    private javax.swing.JComboBox<String> UIverRepComboProv;
    private javax.swing.JTextArea UIverRepVerReportes;
    private javax.swing.JButton UIverRepbtnVerReport;
    private javax.swing.JButton UIverRepbtnVolver;
    private javax.swing.JPanel adminAddPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.ButtonGroup adminSexo;
    private javax.swing.JPanel hacerReportePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.ButtonGroup reporteSexo;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JPanel userPanel;
    private javax.swing.JPanel verReportesPanel;
    // End of variables declaration//GEN-END:variables
}
