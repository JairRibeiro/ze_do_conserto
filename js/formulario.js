/**
 * Created by Camilo on 01/09/2016.
 */


function tratandoCombobox(elementId) {
    var combobox = document.getElementById(elementId);
        if(combobox.options[combobox.selectedIndex].value == "cidade") {
            combobox.remove(0);
        }else if(combobox.options[combobox.selectedIndex].value == "estado"){
            combobox.remove(0);
         }
}

function validandoFormulario(){
    var objeto = new Array();

    objeto.push(document.getElementById("nome"));
    objeto.push(document.getElementById("cpf"));
    objeto.push(document.getElementById("telefone"));
    objeto.push(document.getElementById("celular"));
    objeto.push(document.getElementById("endereco"));
    objeto.push(document.getElementById("complemento"));
    objeto.push(document.getElementById("numero"));
    objeto.push(document.getElementById("cidade"));
    objeto.push(document.getElementById("estado"));
    objeto.push(document.getElementById("nome"));


}






