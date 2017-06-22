/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteDigitalSignageData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = implementacao.DigitalSignagePersistentManager.instance().getSession().beginTransaction();
		try {
			implementacao.Cliente implementacaoCliente = implementacao.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			implementacao.ClienteDAO.delete(implementacaoCliente);
			implementacao.Canal implementacaoCanal = implementacao.CanalDAO.loadCanalByQuery(null, null);
			// Delete the persistent object
			implementacao.CanalDAO.delete(implementacaoCanal);
			implementacao.Conteudo implementacaoConteudo = implementacao.ConteudoDAO.loadConteudoByQuery(null, null);
			// Delete the persistent object
			implementacao.ConteudoDAO.delete(implementacaoConteudo);
			implementacao.FicheiroMultimedia implementacaoFicheiroMultimedia = implementacao.FicheiroMultimediaDAO.loadFicheiroMultimediaByQuery(null, null);
			// Delete the persistent object
			implementacao.FicheiroMultimediaDAO.delete(implementacaoFicheiroMultimedia);
			implementacao.PrevisaoTempo implementacaoPrevisaoTempo = implementacao.PrevisaoTempoDAO.loadPrevisaoTempoByQuery(null, null);
			// Delete the persistent object
			implementacao.PrevisaoTempoDAO.delete(implementacaoPrevisaoTempo);
			implementacao.FeedRSS implementacaoFeedRSS = implementacao.FeedRSSDAO.loadFeedRSSByQuery(null, null);
			// Delete the persistent object
			implementacao.FeedRSSDAO.delete(implementacaoFeedRSS);
			implementacao.Rede implementacaoRede = implementacao.RedeDAO.loadRedeByQuery(null, null);
			// Delete the persistent object
			implementacao.RedeDAO.delete(implementacaoRede);
			implementacao.Player implementacaoPlayer = implementacao.PlayerDAO.loadPlayerByQuery(null, null);
			// Delete the persistent object
			implementacao.PlayerDAO.delete(implementacaoPlayer);
			implementacao.Coordenada implementacaoCoordenada = implementacao.CoordenadaDAO.loadCoordenadaByQuery(null, null);
			// Delete the persistent object
			implementacao.CoordenadaDAO.delete(implementacaoCoordenada);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteDigitalSignageData deleteDigitalSignageData = new DeleteDigitalSignageData();
			try {
				deleteDigitalSignageData.deleteTestData();
			}
			finally {
				implementacao.DigitalSignagePersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
