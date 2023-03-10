package net.minecraft.src;

public class NetHandler {
	public void handleMapChunk(Packet51MapChunk packet) {
	}

	public void registerPacket(Packet packet) {
	}

	public void handleErrorMessage(String message) {
	}

	public void handleKickDisconnect(Packet255KickDisconnect packet) {
		this.registerPacket(packet);
	}

	public void handleLogin(Packet1Login packet) {
		this.registerPacket(packet);
	}

	public void handleFlying(Packet10Flying packet) {
		this.registerPacket(packet);
	}

	public void handleMultiBlockChange(Packet52MultiBlockChange packet) {
		this.registerPacket(packet);
	}

	public void handleBlockDig(Packet14BlockDig packet) {
		this.registerPacket(packet);
	}

	public void handleBlockChange(Packet53BlockChange packet) {
		this.registerPacket(packet);
	}

	public void handlePreChunk(Packet50PreChunk packet) {
		this.registerPacket(packet);
	}

	public void handleNamedEntitySpawn(Packet20NamedEntitySpawn packet) {
		this.registerPacket(packet);
	}

	public void handleEntity(Packet30Entity packet30Entity1) {
		this.registerPacket(packet30Entity1);
	}

	public void handleEntityTeleport(Packet34EntityTeleport packet34EntityTeleport1) {
		this.registerPacket(packet34EntityTeleport1);
	}

	public void handlePlace(Packet15Place packet) {
		this.registerPacket(packet);
	}

	public void handleBlockItemSwitch(Packet16BlockItemSwitch packet) {
		this.registerPacket(packet);
	}

	public void handleDestroyEntity(Packet29DestroyEntity packet) {
		this.registerPacket(packet);
	}

	public void handlePickupSpawn(Packet21PickupSpawn packet) {
		this.registerPacket(packet);
	}

	public void handleCollect(Packet22Collect packet) {
		this.registerPacket(packet);
	}

	public void handleChat(Packet3Chat packet) {
		this.registerPacket(packet);
	}

	public void handleAddToInventory(Packet17AddToInventory packet) {
		this.registerPacket(packet);
	}

	public void handleVehicleSpawn(Packet23VehicleSpawn packet) {
		this.registerPacket(packet);
	}

	public void handleArmAnimation(Packet18ArmAnimation packet) {
		this.registerPacket(packet);
	}

	public void handleHandshake(Packet2Handshake packet) {
		this.registerPacket(packet);
	}
}
