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
		stringBuilder2.append("Eu já dei risada até a barriga doer,\r\n");
		stringBuilder2.append("Já nadei até perder o fôlego,\r\n");
		stringBuilder2.append("Já chorei até dormir\r\n");
		stringBuilder2.append("E acordei com o rosto desfigurado.\r\n");
		stringBuilder2.append("Já fiz cosquinha na minha irmã só pra ela parar de chorar,\r\n");
		stringBuilder2.append("Já me queimei brincando com vela.\r\n");
		stringBuilder2.append("Eu já fiz bola de chiclete e melequei todo o rosto.\r\n");
		stringBuilder2.append("Já conversei com o espelho.\r\n");
		stringBuilder2.append("E até já brinquei de ser bruxo.\r\n");
		stringBuilder2.append("Já quis ser astronauta,\r\n");
		stringBuilder2.append("Violonista, mágico, caçador e trapezista.\r\n");
		stringBuilder2.append("Já me escondi atrás da cortina e esqueci os pés pra fora,\r\n");
		stringBuilder2.append("Já passei trote por telefone,\r\n");
		stringBuilder2.append("Já tomei banho de chuva,\r\n");
		stringBuilder2.append("E acabei me viciando.\r\n");
		stringBuilder2.append("Já roubei beijo,\r\n");
		stringBuilder2.append("Já fiz confissões antes de dormir\r\n");
		stringBuilder2.append("Num quarto escuro pro melhor amigo.\r\n");
		stringBuilder2.append("Já confundi sentimentos,\r\n");
		stringBuilder2.append("Peguei atalho errado\r\n");
		stringBuilder2.append("E continuo andando pelo desconhecido.\r\n");
		stringBuilder2.append("Já raspei o fundo da panela de arroz carreteiro,\r\n");
		stringBuilder2.append("Já me cortei fazendo a barba apressado,\r\n");
		stringBuilder2.append("Já chorei ouvindo música no ônibus.\r\n");
		stringBuilder2.append("Já tentei esquecer algumas pessoas,\r\n");
		stringBuilder2.append("Mas descobri que essas são as mais difíceis de se\r\n");
		stringBuilder2.append("[esquecer.\r\n");
		stringBuilder2.append("Já subi escondido no telhado pra tentar pegar estrelas,\r\n");
		stringBuilder2.append("Já subi em árvore pra roubar fruta,\r\n");
		stringBuilder2.append("Já caí da escada de bunda.\r\n");
		stringBuilder2.append("Conheci a morte de perto,\r\n");
		stringBuilder2.append("E agora anseio por viver cada dia.\r\n");
		stringBuilder2.append("Já fiz juras eternas,\r\n");
		stringBuilder2.append("Já escrevi no muro da escola,\r\n");
		stringBuilder2.append("Já chorei sentado no chão do banheiro,\r\n");
		stringBuilder2.append("Já fugi de casa pra sempre,\r\n");
		stringBuilder2.append("E voltei no outro instante.\r\n");
		stringBuilder2.append("Já saí pra caminhar sem rumo,\r\n");
		stringBuilder2.append("FIM");
		String textao = stringBuilder2.toString();

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hoje é tempo de ser feliz!\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"A vida é fruto da decisão de cada momento. Talvez seja por isso, que a ideia de plantio seja tão reveladora sobre a arte de viver.\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Viver é plantar. É atitude de constante semeadura, de deixar cair na terra de nossa existência as mais diversas formas de sementes.\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Cada escolha, por menor que seja, é uma forma de semente que lançamos sobre o canteiro que somos. Um dia, tudo o que agora silenciosamente plantamos, ou deixamos plantar em nós, será plantação que poderá ser vista de longe...\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Para cada dia, o seu empenho. A sabedoria bíblica nos confirma isso, quando nos diz que \"debaixo do céu há um tempo para cada coisa!\".\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Hoje, neste tempo que é seu, o futuro está sendo plantado. As escolhas que você procura, os amigos que você cultiva, as leituras que você faz, os valores que você abraça, os amores que você ama, tudo será determinante para a colheita futura.\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append(
				"Felicidade talvez seja isso: alegria de recolher da terra que somos, frutos que sejam agradáveis aos olhos!\r\n");
		stringBuilder.append("\r\n");
		stringBuilder.append("Infelicidade, talvez seja o contrário.\r\n FIM");

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
