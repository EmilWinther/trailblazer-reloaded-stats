package trs;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class TrailblazerReloadedStatsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(TrailblazerReloadedStatsPlugin.class);
		RuneLite.main(args);
	}
}