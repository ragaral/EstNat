<?php
session_start();
require_once '../Logica/Connexio.php';
require_once '../Logica/Usuaris.php';
    $Connexio = new Connexio();
    $Connexio->connectar();
    $Connexio->selectdb("socialtravel");
    $usuari = new Usuaris();
?>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
 <script type="text/javascript">
	$(document).ready(function() {    
            $("#form").bind("submit", function() { 
                $.fancybox.showActivity(); 
                $.ajax({ 
                        type    : "POST", 
                        cache   : false, 
                        url     : "dades.php", 
                        data    : $(this).serializeArray(), 
                        success: function(data) { 
                                $.fancybox(data); 
                        } 
                }); 
                return false; 
            });  
	});
        </script>
    </head>
    <body>
        <?php
        if(@$_POST){ 
         
            $usuari = new Usuaris();
            $usuari->updateUsuari($_POST[nom], $_POST[cognom], $_POST[dni], $_POST[usuari], $_POST[pass]);
            echo "<p><B>Datos modificados correctamente</B></p>";
        }
        else{
            
           
            $result = $usuari->getUsuariByName(@$_SESSION[usuario]);
            echo "<p style='text-align:left; font-size:14px'><B>Datos personales:</B></p>";
            echo "<form id='form' method='POST'>";
            echo "<table border=0 style='font-size:12px'>";
            echo    "<tr>";
            echo        "<td>Nombre:</td>";
            echo        '<td><input type="text" name="nom" value="'.mysql_result($result,0,1).'"></td>';
            echo    "</tr>";
            echo        "<td>Apellido:</td>";
            echo        '<td><input type="text" name="cognom" value="'.mysql_result($result,0,2).'"></td>';
            echo    "</tr>";
            echo        "<td>DNI:</td>";
            echo        '<td><input type="text" name="dni" value="'.mysql_result($result,0,3).'"></td>';
            echo    "</tr>";
            echo        "<td>Usuario:</td>";
            echo        '<td><input type="text" name="usuari" value="'.mysql_result($result,0,4).'"></td>';
            echo    "</tr>";
            echo        "<td>Password:</td>";
            echo        '<td><input type="password" name="pass" value="'.mysql_result($result,0,5).'"></td>';
            echo    "</tr>";   
            echo    "<tr>";
            echo        "<td></td>";
            echo        '<td><input type="submit" name="modificarDatos" value="Enviar"></td>';
            echo    "</tr>";
            echo "</table>";
            echo "</form>"; 
        
        }
        echo "<div id='guardarDades'> </div>";
        ?>
    </body>
</html>
