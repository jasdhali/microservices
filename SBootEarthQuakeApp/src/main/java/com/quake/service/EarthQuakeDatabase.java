package com.quake.service;

import org.springframework.stereotype.Component;

import com.quake.beans.EarthDataRoot;

@Component
public class EarthQuakeDatabase {
	private EarthDataRoot dataRoot;

	public EarthDataRoot getDataRoot() {
		return dataRoot;
	}

	public void setDataRoot(EarthDataRoot dataRoot) {
		this.dataRoot = dataRoot;
	}
}