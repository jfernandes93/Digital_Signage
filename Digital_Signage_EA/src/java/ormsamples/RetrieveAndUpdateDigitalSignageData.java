/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateDigitalSignageData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = implementacao.DigitalSignagePersistentManager.instance().getSession().beginTransaction();
		try {
			implementacao.Cliente implementacaoCliente = implementacao.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.ClienteDAO.save(implementacaoCliente);
			implementacao.Canal implementacaoCanal = implementacao.CanalDAO.loadCanalByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.CanalDAO.save(implementacaoCanal);
			implementacao.Conteudo implementacaoConteudo = implementacao.ConteudoDAO.loadConteudoByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.ConteudoDAO.save(implementacaoConteudo);
			implementacao.FicheiroMultimedia implementacaoFicheiroMultimedia = implementacao.FicheiroMultimediaDAO.loadFicheiroMultimediaByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.FicheiroMultimediaDAO.save(implementacaoFicheiroMultimedia);
			implementacao.PrevisaoTempo implementacaoPrevisaoTempo = implementacao.PrevisaoTempoDAO.loadPrevisaoTempoByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.PrevisaoTempoDAO.save(implementacaoPrevisaoTempo);
			implementacao.FeedRSS implementacaoFeedRSS = implementacao.FeedRSSDAO.loadFeedRSSByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.FeedRSSDAO.save(implementacaoFeedRSS);
			implementacao.Rede implementacaoRede = implementacao.RedeDAO.loadRedeByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.RedeDAO.save(implementacaoRede);
			implementacao.Player implementacaoPlayer = implementacao.PlayerDAO.loadPlayerByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.PlayerDAO.save(implementacaoPlayer);
			implementacao.Coordenada implementacaoCoordenada = implementacao.CoordenadaDAO.loadCoordenadaByQuery(null, null);
			// Update the properties of the persistent object
			implementacao.CoordenadaDAO.save(implementacaoCoordenada);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cliente by ClienteCriteria");
		implementacao.ClienteCriteria implementacaoClienteCriteria = new implementacao.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoClienteCriteria.ID.eq();
		System.out.println(implementacaoClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Canal by CanalCriteria");
		implementacao.CanalCriteria implementacaoCanalCriteria = new implementacao.CanalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoCanalCriteria.ID.eq();
		System.out.println(implementacaoCanalCriteria.uniqueCanal());
		
		System.out.println("Retrieving Conteudo by ConteudoCriteria");
		implementacao.ConteudoCriteria implementacaoConteudoCriteria = new implementacao.ConteudoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoConteudoCriteria.ID.eq();
		System.out.println(implementacaoConteudoCriteria.uniqueConteudo());
		
		System.out.println("Retrieving FicheiroMultimedia by FicheiroMultimediaCriteria");
		implementacao.FicheiroMultimediaCriteria implementacaoFicheiroMultimediaCriteria = new implementacao.FicheiroMultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoFicheiroMultimediaCriteria.ID.eq();
		System.out.println(implementacaoFicheiroMultimediaCriteria.uniqueFicheiroMultimedia());
		
		System.out.println("Retrieving PrevisaoTempo by PrevisaoTempoCriteria");
		implementacao.PrevisaoTempoCriteria implementacaoPrevisaoTempoCriteria = new implementacao.PrevisaoTempoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoPrevisaoTempoCriteria.ID.eq();
		System.out.println(implementacaoPrevisaoTempoCriteria.uniquePrevisaoTempo());
		
		System.out.println("Retrieving FeedRSS by FeedRSSCriteria");
		implementacao.FeedRSSCriteria implementacaoFeedRSSCriteria = new implementacao.FeedRSSCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoFeedRSSCriteria.ID.eq();
		System.out.println(implementacaoFeedRSSCriteria.uniqueFeedRSS());
		
		System.out.println("Retrieving Rede by RedeCriteria");
		implementacao.RedeCriteria implementacaoRedeCriteria = new implementacao.RedeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoRedeCriteria.ID.eq();
		System.out.println(implementacaoRedeCriteria.uniqueRede());
		
		System.out.println("Retrieving Player by PlayerCriteria");
		implementacao.PlayerCriteria implementacaoPlayerCriteria = new implementacao.PlayerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoPlayerCriteria.ID.eq();
		System.out.println(implementacaoPlayerCriteria.uniquePlayer());
		
		System.out.println("Retrieving Coordenada by CoordenadaCriteria");
		implementacao.CoordenadaCriteria implementacaoCoordenadaCriteria = new implementacao.CoordenadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//implementacaoCoordenadaCriteria.ID.eq();
		System.out.println(implementacaoCoordenadaCriteria.uniqueCoordenada());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateDigitalSignageData retrieveAndUpdateDigitalSignageData = new RetrieveAndUpdateDigitalSignageData();
			try {
				retrieveAndUpdateDigitalSignageData.retrieveAndUpdateTestData();
				//retrieveAndUpdateDigitalSignageData.retrieveByCriteria();
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
