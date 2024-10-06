# Praticando a implementação de Fila(`Queue<*>`)

### 1. Exemplo

Usando a estrutura de dados Fila, crie uma fila de documentos que
precisam ser impressos. Cada documento é composto de um nome
e quantidade de folhas a serem impressas. O programa deve:
Enfileirar os documentos;
E seguindo a ordem, o programa deve "imprimir" cada documento,
desenfileirando da fila. Se desejar pode usar Threads para esperar a
impressão de acordo com o número de folhas a serem impressas.

### 2. Exemplo

Escreva um programa que simule o atendimento a distribuição de senhas de atendimento
a um grupo de pessoas. Cada pessoa deve receber uma __senha prioritária__ ou uma __senha normal__

#### __Critérios:__
- Existe apenas um atendente 
- 1 Pessoa normal deve ser atendidada a cada 3 atendimentos de pessoas com prioridade
- Se não houver prioridades pessoas são atendidas normalmente

### 3. Exemplo

Utilize a classe Fila para similar um sistema de senhas de um pronto Socorro. 
Cada pessoa pode ser classificada com 3 códigos: __vermelho__ - de prioridade maior,
__amarelo__ - prioridade media e __verde__ quando a situação não é grave e a pessoa pode esperar mais tempo.
O programa deve obedecer às seguintes condições: Enfileire 6 pessoas na fila inicial.
Pessoas com prioridade vermelha devem ser atendidas primeiro; Cada consulta dura cerca de 5 segundos,
e depois o próximo da fila é chamado. A cada 4 segundos, 
uma pessoa chega no pronto socorro com prioridade aleatória
__(crie um código java para criar a aleatoriedade).__