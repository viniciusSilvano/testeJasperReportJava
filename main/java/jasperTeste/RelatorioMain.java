package jasperTeste;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import net.sf.jasperreports.engine.JRException;

public class RelatorioMain {
	public static void main(String[] args) throws FileNotFoundException, JRException {
		StringBuilder stringBuilder2 = new StringBuilder();
		stringBuilder2.append("CURRICULUM VITAE\r\n");
		stringBuilder2.append("\r\n");
		stringBuilder2.append("Eu j� dei risada at� a barriga doer,\r\n");
		stringBuilder2.append("J� nadei at� perder o f�lego,\r\n");
		stringBuilder2.append("J� chorei at� dormir\r\n");
		stringBuilder2.append("E acordei com o rosto desfigurado.\r\n");
		stringBuilder2.append("J� fiz cosquinha na minha irm� s� pra ela parar de chorar,\r\n");
		stringBuilder2.append("J� me queimei brincando com vela.\r\n");
		stringBuilder2.append("Eu j� fiz bola de chiclete e melequei todo o rosto.\r\n");
		stringBuilder2.append("J� conversei com o espelho.\r\n");
		stringBuilder2.append("E at� j� brinquei de ser bruxo.\r\n");
		stringBuilder2.append("J� quis ser astronauta,\r\n");
		stringBuilder2.append("Violonista, m�gico, ca�ador e trapezista.\r\n");
		stringBuilder2.append("J� me escondi atr�s da cortina e esqueci os p�s pra fora,\r\n");
		stringBuilder2.append("J� passei trote por telefone,\r\n");
		stringBuilder2.append("J� tomei banho de chuva,\r\n");
		stringBuilder2.append("E acabei me viciando.\r\n");
		stringBuilder2.append("J� roubei beijo,\r\n");
		stringBuilder2.append("J� fiz confiss�es antes de dormir\r\n");
		stringBuilder2.append("Num quarto escuro pro melhor amigo.\r\n");
		stringBuilder2.append("J� confundi sentimentos,\r\n");
		stringBuilder2.append("Peguei atalho errado\r\n");
		stringBuilder2.append("E continuo andando pelo desconhecido.\r\n");
		stringBuilder2.append("J� raspei o fundo da panela de arroz carreteiro,\r\n");
		stringBuilder2.append("J� me cortei fazendo a barba apressado,\r\n");
		stringBuilder2.append("J� chorei ouvindo m�sica no �nibus.\r\n");
		stringBuilder2.append("J� tentei esquecer algumas pessoas,\r\n");
		stringBuilder2.append("Mas descobri que essas s�o as mais dif�ceis de se\r\n");
		stringBuilder2.append("[esquecer.\r\n");
		stringBuilder2.append("J� subi escondido no telhado pra tentar pegar estrelas,\r\n");
		stringBuilder2.append("J� subi em �rvore pra roubar fruta,\r\n");
		stringBuilder2.append("J� ca� da escada de bunda.\r\n");
		stringBuilder2.append("Conheci a morte de perto,\r\n");
		stringBuilder2.append("E agora anseio por viver cada dia.\r\n");
		stringBuilder2.append("J� fiz juras eternas,\r\n");
		stringBuilder2.append("J� escrevi no muro da escola,\r\n");
		stringBuilder2.append("J� chorei sentado no ch�o do banheiro,\r\n");
		stringBuilder2.append("J� fugi de casa pra sempre,\r\n");
		stringBuilder2.append("E voltei no outro instante.\r\n");
		stringBuilder2.append("J� sa� pra caminhar sem rumo,\r\n");
		stringBuilder2.append("FIM");
		String textao = stringBuilder2.toString();

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hoje � tempo de ser feliz!\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"A vida � fruto da decis�o de cada momento. Talvez seja por isso, que a ideia de plantio seja t�o reveladora sobre a arte de viver.\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Viver � plantar. � atitude de constante semeadura, de deixar cair na terra de nossa exist�ncia as mais diversas formas de sementes.\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Cada escolha, por menor que seja, � uma forma de semente que lan�amos sobre o canteiro que somos. Um dia, tudo o que agora silenciosamente plantamos, ou deixamos plantar em n�s, ser� planta��o que poder� ser vista de longe...\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Para cada dia, o seu empenho. A sabedoria b�blica nos confirma isso, quando nos diz que \"debaixo do c�u h� um tempo para cada coisa!\".\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Hoje, neste tempo que � seu, o futuro est� sendo plantado. As escolhas que voc� procura, os amigos que voc� cultiva, as leituras que voc� faz, os valores que voc� abra�a, os amores que voc� ama, tudo ser� determinante para a colheita futura.\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Felicidade talvez seja isso: alegria de recolher da terra que somos, frutos que sejam agrad�veis aos olhos!\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append("Infelicidade, talvez seja o contr�rio.\r\n FIM");

		String textao2 = stringBuilder.toString();

		List<RelatorioDTO> dados = new ArrayList<>();
		/*dados.add(RelatorioDTOBuilder.getInstance()
				.setMeuFieldTeste(textao)
				.setMeuFieldTeste2(textao)
				.setMeuFieldTeste3(textao)
				.build());*/
		dados.add(RelatorioDTOBuilder.getInstance()
				//.setMeuFieldTeste2(null)
				.setMeuFieldTeste(textao)
				.setMeuFieldTeste3(textao2)
				.build());

		new RelatorioTeste().printReport(dados);
	}
}
