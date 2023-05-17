# exercicio de estrutura de dados valendo nota
# não fiz a ultima questão



# Questões:
1. Uma empresa de logística precisa organizar sua frota de caminhões de forma eficiente
para realizar entregas em diferentes locais. Implemente um programa em Java que
utilize pilhas para ajudar na organização e na priorização das entregas.
Para resolver este problema, o aluno deve implementar a lógica de pilha em Java e
utilizar essa estrutura para armazenar as informações dos caminhões e das entregas. O
aluno deve criar funções que permitam inserir e remover elementos da pilha e definir a
lógica de priorização das entregas com base nas informações fornecidas. É importante
que o código esteja bem organizado e documentado para facilitar o entendimento. As
estruturas de classe do Caminhão e da carga devem ser pensadas. Quando um objeto
for colocado na pilha ele deve saber qual o nível de criticidade da sua carga.
2. Um desenvolvedor de software precisa implementar uma funcionalidade que permita
ao usuário desfazer a última ação realizada na aplicação. Implemente uma solução em
Java que utilize pilhas para armazenar as ações realizadas pelo usuário e permite
desfazer a última ação.
Vocês devem definir a estrutura de dados para a pilha e implementar funções que
permitam inserir e remover elementos da pilha. Além disso, o aluno deve definir a
lógica de desfazer a última ação realizada pelo usuário, que consiste em remover o
último elemento inserido na pilha e executar a ação inversa. A estrutura deve permitir
desfazer até 16 ações de uma só vez, mas sempre respeitando a pilha de execuções.
3. Um aplicativo de notas precisa armazenar as notas do usuário em ordem cronológica
inversa, para que as notas mais recentes apareçam primeiro. Implemente uma solução
em Java que utilize pilhas para armazenar as notas e exibi-las em ordem inversa.
4. Magic: The Gathering é um jogo de cartas colecionáveis lançado em 1993 pela Wizards
of the Coast. É um dos jogos mais populares e antigos deste tipo e envolve os
jogadores criando decks de cartas com habilidades e poderes diferentes para jogar
contra outros jogadores. O objetivo do jogo é reduzir a vida do oponente para zero
usando cartas de ataque e defesa enquanto usa estratégias para proteger seu próprio
baralho. O jogo também possui um enredo detalhado e vários personagens, e foi
expandido em várias edições com novas cartas e regras adicionais.
Implemente uma classe em Java que represente uma pilha de mágicas e habilidades do
jogo Magic: The Gathering. A classe deve ter os seguintes métodos:
a. push: adiciona uma nova mágica ou habilidade na pilha;
b. pop: remove e retorna a última mágica ou habilidade adicionada na pilha;
c. top: retorna a última mágica ou habilidade adicionada na pilha sem removê-la;
d. isEmpty: retorna true se a pilha estiver vazia e false caso contrário;
e. clear: remove todos os elementos da pilha.
Cada elemento na pilha deve ser representado como uma instância da classe
MagicCard, que contém as seguintes informações:
a. name: o nome da mágica ou habilidade;
b. type: o tipo da mágica ou habilidade (terreno, criatura, encantamento,
artefato, instantânea, feitiço, planeswalker, habilidade ativada, habilidade
disparada);
c. cost: o custo para jogar a mágica ou habilidade (em mana);
d. effect: o efeito da mágica ou habilidade.
A classe MagicCard também deve ter um método toString que retorna uma string
formatada com as informações da carta. Na sua estrutura, MagicCards do tipo terreno,
criatura, encantamento, artefato, planeswalker ou feitiço só podem ser colocadas na
pilha se a pilha estiver vazia. MagicCards de Instantâneas, Habilidades ativadas ou
disparadas podem ser adicionadas na pilha a qualquer momento.
Implemente um método para remover uma MagicCard da pilha independentemente
de sua posição na pilha. Essa regra de negócio decorre das regras especiais do jogo.
Isso não deve alterar a ordem da pilha exceto pela remoção da MagicCard.
Para testar a classe, crie uma instância da pilha, adicione algumas cartas usando o
método push, remova algumas cartas usando o método pop e exiba as cartas restantes
usando o método top. Certifique-se de testar também os outros métodos da classe
para garantir que eles funcionem corretamente.
