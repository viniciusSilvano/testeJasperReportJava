package jasperTeste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RelatorioTeste implements Serializable {

	private static final long serialVersionUID = -7341125702574208357L;
	
	public void printReport(List<RelatorioDTO> dados) throws JRException, FileNotFoundException {
		Logger log = Logger.getLogger(this.getClass().getName());
		try {
			JasperReport jasperReport = JasperCompileManager
					.compileReport("C:\\Desenv\\ProjetoTeste\\JasperTeste\\jasperTeste\\main\\resource\\relatorios\\teste.jrxml");
			JRDataSource dataSource = new JRBeanCollectionDataSource(dados);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, new HashMap<String, Object>(), dataSource);
			
			File file = new File("C:\\Desenv\\ProjetoTeste\\JasperTeste\\jasperTeste\\main\\resource\\relatorios");
			file.mkdirs();
			JasperExportManager.exportReportToPdfFile(jasperPrint, file.getAbsoluteFile() + "\\teste.pdf");
			log.info("-----relatorio gerado-----");
		}catch (Exception e) {
			log.info("Erro ao gerar arquivo");
		}
	}
}
