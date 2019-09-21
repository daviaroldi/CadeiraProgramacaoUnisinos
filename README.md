Padr�es utilizados no c�digo:

Creator:
	Foi utilizado o padr�o Creator nas classes Consultor e Analista. Elas possuem como um dos atributos uma lista de objetos da classe Proposta. Dessa forma, elas t�m o conhecimento de como criar
	uma proposta. A classe que instanciar um objeto das classes Consultor ou Analista n�o precisa ter uma depend�ncia com a classe Proposta. 
	Assim, o m�todo addProposta recebe apenas as informa��es e ele � o respons�vel por instanciar o objeto Proposta.
	
Controller:
	Foi utilizado o padr�o controller atrav�s da classe AnalistaController. A ideia � que ela seja possua m�todos respons�veis por criar a inst�ncia de Analista para adicionar propostas a ela.
	Esses ser�o os m�todos utilizados por qualquer interface que queira interagir com essa parte do sistema. No exemplo, utilizamos a linha de comando.
	
Information Expert:
	Esse padr�o podemos perceber na rela��o entre a classe Proposta e a classe Contrato. Quem possuir uma inst�ncia da classe Proposta n�o conhece a classe Contrato. Para obter o texto de um contrato,
	a classe Proposta disponibiliza o m�todo getTextoContrato, quem � o respons�vel por obt�-lo a partir da inst�ncia privada de Contrato que a classe possui.

High Cohesion:
	Esse padr�o ser� demonstrado em uma classe espec�fica que salva a proposta (onde quer que seja). Com isso, n�o deixamos a clase Proposta com mais de uma responsabilidade.

Low Coupling:
	Tentamos deixar o m�nimo de acoplamento poss�vel no c�digo. Podemos ver que as responsabilidaddes est�o bem distribu�das.