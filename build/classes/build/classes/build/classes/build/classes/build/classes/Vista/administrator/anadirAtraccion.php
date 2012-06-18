<!DOCTYPE html>
<?php
    session_start();
    require_once '../../Logica/Connexio.php';
    require_once '../../Logica/TipusAtraccions.php';
    require_once '../../Logica/Estat.php';
    require_once '../../Logica/Desti.php';
    require_once '../../Logica/Promocio.php';
    
    $con = new Connexio();
    
    if(!$_SESSION[usuari]){
        header("Location: index.php");
    }  
?>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <?php
            $estat = new Estat();
            $desti = new Desti();
            $prom = new Promocio();
            $tAtrac = new TipusAtraccions();
        ?>
        <form method="POST" enctype="multipart/form-data">
            <table>
                <tr>
                    <td><b> Nombre </b></td>
                    <td><b> Descripcion </b></td>
                    <td><b> Duracion </b></td>
                    <td><b> Precio </b></td>
                    <td><b> Estado </b></td>
                    <td><b> Destino </b></td>
                    <td><b> Promocion </b></td>
                    <td><b> Tipo </b></td>
                </tr>
                <tr>
                    <td> <input type="text" name="nomAtrac" > </td>
                    <td> <input type="text" name="descr"> </td>
                    <td> <input type="text" name="duracion" size="4">dias </td>
                    <td> <input type="text" name="precio" size="4">€ </td>
                    <td> <select name="estado">
                            <?php for($j = 0; $j < $estat->getNumEstats(); $j++){
                                        echo "<option>".$estat->getTipusEstat($j)."</option>";
                                  } ?>
                        </select> 
                    </td>
                    <td> <select name="destino">
                            <?php for($j = 0; $j < $desti->getNumDestins(); $j++){
                                        echo "<option>".$desti->getNomDesti($j)."</option>";
                                  } ?>
                        </select> 
                    </td>
                    <td> <select name="promocion">
                            <option> null </option>
                            <?php for($j = 0; $j < $prom->getNumPromocions(); $j++){
                                        echo "<option>".$prom->getDescripcio($j)."</option>";
                                  } ?>
                        </select>
                    </td>
                    <td> 
                        <select name="tipo"> 
                            <?php for($j = 0; $j < $tAtrac->getNumTipusAtraccions(); $j++){
                                        echo "<option>".$tAtrac->getNom($j)."</option>";
                                  } ?>
                        </select>
                    </td>
                </tr>
            </table>
            <b>Imagen:</b> <input type="file" name="imagen"><br>
            <input type="submit" name="anadirAtraccion" value="Añadir">
        </form>
    </body>
</html>
