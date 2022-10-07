/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class XeguiModify {

    public static List<Xegui> findAll() {
        List<Xegui> xeguiList = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            //lay tat ca danh sach xe gui
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            //query
            String sql = "select * from xegui";
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Xegui std = new Xegui(resultSet.getString("bienso"),
                        resultSet.getString("tenchuxe"), resultSet.getString("mauxe"),
                        resultSet.getString("loaixe"), resultSet.getString("ngaygui"));
                xeguiList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc

        return xeguiList;
    }

    public static void insert(Xegui std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            //query
            String sql = "insert into xegui(bienso, tenchuxe, mauxe, loaixe, ngaygui) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getBienso());
            statement.setString(2, std.getTenchuxe());
            statement.setString(3, std.getMauxe());
            statement.setString(4, std.getLoaixe());
            statement.setString(5, std.getNgaygui());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void update(Xegui std) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            //query
            String sql = "update xegui set bienso=?,tenchuxe=?,mauxe=?,loaixe=?,ngaygui=? where bienso = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getBienso());
            statement.setString(2, std.getTenchuxe());
            statement.setString(3, std.getMauxe());
            statement.setString(4, std.getLoaixe());
            statement.setString(5, std.getNgaygui());

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static void delete(String bienso) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            //query
            String sql = "delete from xegui where bienso = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, bienso);

            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.
    }

    public static List<Xegui> findByBienso(String bienso) {
        List<Xegui> xeguiList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //lay tat ca danh sach sinh vien
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            //query
            String sql = "select * from xegui where bienso like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + bienso + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Xegui std = new Xegui(resultSet.getString("bienso"),
                        resultSet.getString("tenchuxe"), resultSet.getString("mauxe"),
                        resultSet.getString("loaixe"), resultSet.getString("ngaygui"));
                xeguiList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(XeguiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ket thuc.

        return xeguiList;
    }
}
