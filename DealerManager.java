package agent;
import java.util.ArrayList;
import java.util.List;

public class DealerManager {

    private List<Dealer> agents = new ArrayList<>();
    private static final Block root = new Block(0, "ROOT_HASH", "ROOT");

    public Dealer addAgent(String name, int port) {
        Dealer a = new Dealer(name, "localhost", port, root, agents);
        a.startHost();
        agents.add(a);
        return a;
    }

    public Dealer getDealer(String name) {
        for (Dealer a : agents) {
            if (a.getName().equals(name)) {
                return a;
            }
        }
        return null;
    }

    public List<Dealer> getAllAgents() {
        return agents;
    }

    public void deleteDealer(String name) {
        final Dealer a = getDealer(name);
        if (a != null) {
            a.stopHost();
            agents.remove(a);
        }
    }

    public List<Block> getAgentBlockchain(String name) {
        final Dealer agent = getDealer(name);
        if (agent != null) {
            return agent.getBlockchain();
        }
        return null;
    }

    public void deleteAllAgents() {
        for (Dealer a : agents) {
            a.stopHost();
        }
        agents.clear();
    }

    public Block createBlock(final String name) {
        final Dealer agent = getDealer(name);
        if (agent != null) {
            return agent.createBlock();
        }
        return null;
    }
}