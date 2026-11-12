/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ragnar.ddecoradmin.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ragnar_DX
 */
public class Conexion {

    private static final String URL =
        "jdbc:mysql://localhost:3306/ddecor";

    private static final String USER = "NAHUEL";

    private static final String PASSWORD = "12012007556123";

    public static Connection conectar() throws SQLException {

        return DriverManager.getConnection(
            URL,
            USER,
            PASSWORD
        );
    }
}
/*
Elemento	Función
Connection	Representa la conexión con MySQL.
DriverManager	Gestiona la obtención de conexiones.
URL             Dirección del servidor y esquema.
USER            Usuario de MySQL.
PASSWORD	Contraseña del usuario.
SQLException	Maneja errores relacionados con SQL.
*/