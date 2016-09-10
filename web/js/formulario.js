/**
 * Created by Camilo on 01/09/2016.
 */


function tratandoCombobox(elementId) {
    var combobox = document.getElementById(elementId);
        if(combobox.options[combobox.selectedIndex].value === "cidade") {
            combobox.remove(0);
        }else if(combobox.options[combobox.selectedIndex].value === "estado"){
            combobox.remove(0);
        }
}

function inseriCliente(){
    $(document).ready(function (){
       $('.button,.bg-success').click(function (event) {
           if($('#nome').val() === '' || $('#bairro').val() === '' || $('#cpf').val() === '' ||
             $('#datanascimento').val() ==='' || $('#celular').val() === '' ||
             $('#cep').val() === '' || $('#cidade').val() === '' || $('#complemento').val() === '' ||
             $('#email').val() === '' || $('#endereco').val() === '' || $('#estado').val() === '' ||
             $('#telefone').val() === '' || $('#numero').val() === '')
            {
                alert('entrou aqui 32');
                //return false;
            }else{
                var nome = $('#nome').val();
                var cpf = $('#cpf').val();
                var telefone = $('#telefone').val();
                var celular = $('#celular').val();
                var dataNascimento = $('#datanascimento').val();
                var endereco = $('#endereco').val();
                var complemento = $('#complemento').val();
                var numero = $('#numero').val();
                var cep = $('#cep').val();
                var bairro = $('#bairro').val();
                var cidade = $('#cidade').val();
                var estado = $('#estado').val();
                var email = $('#email').val();
                var confirmaEmail = 0;
                if ($('#marcacaoEmail') !== ''){
                    confirmaEmail = 1;
               }else{
                    confirmaEmail = 0;
               }
               $.post('/ze_conserto/ClienteServlet',
                {nome:nome,
                 cpf:cpf,
                 telefone:telefone,
                 celular:celular,
                 datanascimento:dataNascimento,
                 endereco:endereco,
                 complemento:complemento,
                 numero:numero,
                 cep:cep,
                 bairro:bairro,
                 cidade:cidade,
                 estado:estado,
                 email:email,
                 confirmaEmail:confirmaEmail}
                 ,function (mensagem){
                      alert(mensagem);
                 });
            }    
       });
       return false;
    });
}






