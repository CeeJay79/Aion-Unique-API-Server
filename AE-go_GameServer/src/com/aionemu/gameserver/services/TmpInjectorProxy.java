/*
 * This file is part of aion-unique <aion-unique.org>.
 *
 *  aion-unique is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-unique is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-unique.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.services;

import com.aionemu.gameserver.spawnengine.SpawnEngine;
import com.google.inject.Inject;

/**
 * @author Mr. Poke
 *
 */
public final class TmpInjectorProxy
{
	@Inject
	private SpawnEngine		spawnEngine;

	public static final TmpInjectorProxy getInstance()
	{
		return SingletonHolder.instance;
	}
	
	@SuppressWarnings("synthetic-access")
	private static class SingletonHolder
	{
		protected static final TmpInjectorProxy instance = new TmpInjectorProxy();
	}

	/**
	 * @return the spawnEngine
	 */
	public SpawnEngine getSpawnEngine()
	{
		return spawnEngine;
	}
}
