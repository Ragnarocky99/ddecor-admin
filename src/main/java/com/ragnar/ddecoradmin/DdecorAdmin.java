package com.ragnar.ddecoradmin;

import com.ragnar.ddecoradmin.db.Conexion;
import com.ragnar.ddecoradmin.ui.LoginView;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DdecorAdmin {

    public static void main(String[] args) {

        try (Connection cn = Conexion.conectar()) {

            JOptionPane.showMessageDialog(
                    null,
                    "Base de Datos Conectada."
            );

            LoginView vistaLogin = new LoginView();

            vistaLogin.setVisible(true);

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "No se pudo conectar a la base de datos.",
                    "Error de conexión",
                    JOptionPane.ERROR_MESSAGE
            );
            e.printStackTrace();

        }

    }
}
