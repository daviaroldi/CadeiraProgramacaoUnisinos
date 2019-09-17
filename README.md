Padrões a serem implementados no exercício

- Information Expert
	Significado: Consiste em atribuir responsabilidades a quem tem a informação necessária

- Low Coupling
	Significado: Atribuir responsabilidade de forma a manter o acoplamento (desnecessário) baixo.

- Creator
	Significado: A classe "B" deve ser responsável por criar uma instância de "A", se:
		- "B" agrega objetos da classe"A"
		- "B" contém objetos de "A"
		- "B" armazena instâncias de "A"
		- "B", de forma privada, usa instâncias de "A"
		- "B" tem os dados necessários para inicializar "A"

- Controller
	Significado: Atribuir a responsabilidade de uma classe que represente todo o sistema ou represente os serviços de um módulo
ou subsistema. É a classe raíz do sistema/módulo.

- High Cohesion
	Significado: Atribuir responsabilidade de forma a manter a coesão funcional alta.