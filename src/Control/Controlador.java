/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author clavi
 */
public class Controlador implements ActionListener {

    VentEstados objVe;
    VentProceso objVp;
    ArrayList<Proceso> listP;
    ArrayList<Recurso> listR;

    public Controlador() {
        this.objVe = new VentEstados();
        this.objVp = new VentProceso();
        this.listP = new ArrayList<>();
        this.listR = new ArrayList<>();
        objVe.getjButtonCrearP().addActionListener(this);
        objVe.getjButtonEjecutar().addActionListener(this);
        objVp.getjButtonNuevo().addActionListener(this);
        objVp.getjButtonTerm().addActionListener(this);
    }

    public void iniciar() {
        for (int i = 0; i < 6; i++) {
            Recurso objR = new Recurso("" + (i + 1), "Sin Proceso", false);
            listR.add(objR);
        }
        objVe.setVisible(true);
        objVe.llenarTR(listR);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objVe.getjButtonCrearP()) {
            objVp.setVisible(true);
        }

        if (e.getSource() == objVe.getjButtonEjecutar()) {
            Proceso objP2 = new Proceso();
            String msgE = "";
            String msg = objVe.getjTextNuevo().getText();
            objVe.getjTextListo().append(msg);
            objVe.limpiarN();
            objP2 = listP.get(0);
            msgE = objP2.getNom() + "\n";
            objVe.getjTextEjucucion().append(msgE);
            listP.remove(0);
            msg = "";
            for (int i = 0; i < listP.size(); i++) {
                msg = msg + listP.get(i).getNom() + "\n";
            }
            objVe.limpiarL();
            objVe.getjTextListo().append(msg);
            if (objP2.getRec() != 0) {
                if (listR.get(objP2.getRec() - 1).getProc() == "Sin Proceso") {
                    listR.get(objP2.getRec() - 1).setProc(objP2.getNom());
                    listR.get(objP2.getRec() - 1).setOcu(true);
                    objVe.llenarTR(listR);
                }
            }
            if (objP2.getRec() == 0) {
                objVe.getjTextTerminado().append(msgE);
            } else {
                if (Math.floor(Math.random() * 3 + 1) == 1) {
                    if ((listR.get(objP2.getRec() - 1).isOcu() == true) && (listR.get(objP2.getRec() - 1).getProc() == objP2.getNom())) {
                        objVe.getjTextTerminado().append(msgE);
                        listR.get(objP2.getRec() - 1).setProc("Sin Proceso");
                        listR.get(objP2.getRec() - 1).setOcu(false);
                        objVe.llenarTR(listR);
                    } else {
                        objVe.getjTextBloqueado().append(msgE);
                        listP.add(objP2);
                        msg = "";
                        for (int i = 0; i < listP.size(); i++) {
                            msg = msg + listP.get(i).getNom() + "\n";
                        }
                        objVe.limpiarL();
                        objVe.getjTextListo().append(msg);
                    }
                } else {
                    objVe.getjTextBloqueado().append(msgE);
                    listP.add(objP2);
                    msg = "";
                    for (int i = 0; i < listP.size(); i++) {
                        msg = msg + listP.get(i).getNom() + "\n";
                    }
                    objVe.limpiarL();
                    objVe.getjTextListo().append(msg);
                }
            }
        }

        if (e.getSource() == objVp.getjButtonNuevo()) {
            String msg = "";
            if (objVp.getjCheckBoxHilo().isSelected()) {
                Proceso objP = new Proceso(objVp.getjTextFieldId().getText(), objVp.getjTextFieldNom().getText(), Integer.parseInt(objVp.getjTextFieldTam().getText()), Integer.parseInt(objVp.getjTextFieldHilos().getText()), 0);
                listP.add(objP);
                objVp.limpiar();
            } else {
                Proceso objP = new Proceso(objVp.getjTextFieldId().getText(), objVp.getjTextFieldNom().getText(), Integer.parseInt(objVp.getjTextFieldTam().getText()), Integer.parseInt(objVp.getjTextFieldHilos().getText()), objVp.getjSliderRec().getValue());
                listP.add(objP);
                objVp.limpiar();
            }
            for (int i = 0; i < listP.size(); i++) {
                msg = listP.get(i).getNom() + "\n";
            }
            objVe.llenarTP(listP);
            objVe.getjTextNuevo().append(msg);
        }

        if (e.getSource() == objVp.getjButtonTerm()) {
            String msg = "";
            if (objVp.getjCheckBoxHilo().isSelected()) {
                Proceso objP = new Proceso(objVp.getjTextFieldId().getText(), objVp.getjTextFieldNom().getText(), Integer.parseInt(objVp.getjTextFieldTam().getText()), Integer.parseInt(objVp.getjTextFieldHilos().getText()), 0);
                listP.add(objP);
            } else {
                Proceso objP = new Proceso(objVp.getjTextFieldId().getText(), objVp.getjTextFieldNom().getText(), Integer.parseInt(objVp.getjTextFieldTam().getText()), Integer.parseInt(objVp.getjTextFieldHilos().getText()), objVp.getjSliderRec().getValue());
                listP.add(objP);
            }
            for (int i = 0; i < listP.size(); i++) {
                msg = listP.get(i).getNom() + "\n";
            }
            objVe.llenarTP(listP);
            objVe.getjTextNuevo().append(msg);
            objVp.limpiar();
            objVp.dispose();
        }
    }
}
