Padrões utilizados no código:

Creator:
	Foi utilizado o padrão Creator nas classes Consultor e Analista. Elas possuem como um dos atributos uma lista de objetos da classe Proposta. Dessa forma, elas têm o conhecimento de como criar uma proposta. A classe que instanciar um objeto das classes Consultor ou Analista não precisa ter uma dependência com a classe Proposta. 
	Assim, o método addProposta recebe apenas as informações e ele é o responsável por instanciar o objeto Proposta.
	Essa mesma abordagem foi utilizada na classe Cliente.
	
Controller:
	Foi utilizado o padrão controller através da classe AnalistaController. A ideia é que ela possua métodos responsáveis por criar a instância de Analista para adicionar propostas a ela.
	Esses serão os métodos utilizados por qualquer interface que queira interagir com essa parte do sistema. No exemplo, utilizamos a linha de comando.
	
Information Expert:
	Esse padrão podemos perceber na relação entre a classe Proposta e a classe Contrato. Quem possuir uma instância da classe Proposta não conhece a classe Contrato. Para obter o texto de um contrato,
	a classe Proposta disponibiliza o método getTextoContrato, quem é o responsável por obtê-lo a partir da instância privada de Contrato que a classe possui.

High Cohesion:
	Esse padrão é demonstrado na classe SalvaAnalista, cuja única responsabilidade é persistir a instância de um analista. Isso retira essa tarefa da tarefa Analista, o que deixa o código mais coeso.
	A ideia é expandir esse pensamento para as demais classes.

Low Coupling:
	Tentamos deixar o mínimo de acoplamento possível no código. Podemos ver que as responsabilidaddes estão bem distribuídas.
