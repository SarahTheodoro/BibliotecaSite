document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("CadastroUsuarioForm");

    form.addEventListener("submit", async (event) => {
        // Previne o comportamento padrão do formulário, que recarregaria a página
        event.preventDefault();

        // Captura os valores inseridos nos campos do formulário
        const nome = document.getElementById("nome").value;
        const email = document.getElementById("email").value;
        const CPF = document.getElementById("CPF").value;
        const telefone = document.getElementById("telefone").value;
        const senha = document.getElementById("senha").value;
        const tipoUsuarioId = document.getElementById("id_tipo").value;

        // Validação simples para garantir que os dados essenciais foram preenchidos
        if (!nome || !email || !CPF || !telefone || !senha || !tipoUsuarioId) {
            alert("Por favor, preencha todos os campos!");
            return;
        }

        // Certifique-se de que o tipo de usuário é um número inteiro
        console.log("Tipo de Usuário ID selecionado:", tipoUsuarioId); // Verifique o valor de tipoUsuarioId

        // Tenta enviar uma requisição para o backend para cadastrar o usuário
        try {
            const response = await fetch("http://localhost:8080/usuario", {
                method: "POST",  // Define o método HTTP como POST para enviar dados
                headers: {
                    "Content-Type": "application/json",  // Define o tipo de conteúdo como JSON
                },
                // Converte os dados do formulário em uma string JSON e envia no corpo da requisição
                body: JSON.stringify({ 
                    nome, 
                    email, 
                    cpf: CPF,  // Certifique-se que o nome do campo é 'cpf', que é o nome correto no backend
                    telefone, 
                    senha, 
                    id_tipo: parseInt(tipoUsuarioId) // Converte o ID do tipo de usuário para inteiro
                }),
            });

            // Verifica se a resposta foi bem-sucedida (status HTTP 200-299)
            if (response.ok) {
                // Exibe uma mensagem de sucesso para o usuário
                alert("Usuário cadastrado com sucesso!");

                // Limpa os campos do formulário
                form.reset();
            } else {
                // Caso haja um erro, exibe uma mensagem de erro para o usuário
                const errorText = await response.text();  // Recupera o corpo da resposta com o erro
                alert(`Erro ao cadastrar o usuário: ${errorText}`);
            }
        } catch (error) {
            // Caso ocorra um erro na requisição, exibe-o no console
            console.error("Erro ao cadastrar o usuário:", error);
            alert("Erro ao cadastrar o usuário. Confira os logs para mais detalhes.");
        }
    });
});
