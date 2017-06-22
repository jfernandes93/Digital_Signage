/**
 * Licensee: Universidade do Minho
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateDigitalSignageData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = implementacao.DigitalSignagePersistentManager.instance().getSession().beginTransaction();
		try {
			implementacao.Cliente implementacaoCliente = implementacao.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _canal, _rede
			implementacao.ClienteDAO.save(implementacaoCliente);
			implementacao.Canal implementacaoCanal = implementacao.CanalDAO.createCanal();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _player, _conteudo, cliente
			implementacao.CanalDAO.save(implementacaoCanal);
			implementacao.Conteudo implementacaoConteudo = implementacao.ConteudoDAO.createConteudo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _canal, _conteudo
			implementacao.ConteudoDAO.save(implementacaoConteudo);
			implementacao.FicheiroMultimedia implementacaoFicheiroMultimedia = implementacao.FicheiroMultimediaDAO.createFicheiroMultimedia();
			// Initialize the properties of the persistent object here
			implementacao.FicheiroMultimediaDAO.save(implementacaoFicheiroMultimedia);
			implementacao.PrevisaoTempo implementacaoPrevisaoTempo = implementacao.PrevisaoTempoDAO.createPrevisaoTempo();
			// Initialize the properties of the persistent object here
			implementacao.PrevisaoTempoDAO.save(implementacaoPrevisaoTempo);
			implementacao.FeedRSS implementacaoFeedRSS = implementacao.FeedRSSDAO.createFeedRSS();
			// Initialize the properties of the persistent object here
			implementacao.FeedRSSDAO.save(implementacaoFeedRSS);
			implementacao.Rede implementacaoRede = implementacao.RedeDAO.createRede();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _player, _cliente
			implementacao.RedeDAO.save(implementacaoRede);
			implementacao.Player implementacaoPlayer = implementacao.PlayerDAO.createPlayer();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : _coordenada, Tamanho, _rede, _canal
			implementacao.PlayerDAO.save(implementacaoPlayer);
			implementacao.Coordenada implementacaoCoordenada = implementacao.CoordenadaDAO.createCoordenada();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Longitude, Latitude, _player
			implementacao.CoordenadaDAO.save(implementacaoCoordenada);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateDigitalSignageData createDigitalSignageData = new CreateDigitalSignageData();
			try {
				createDigitalSignageData.createTestData();
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
