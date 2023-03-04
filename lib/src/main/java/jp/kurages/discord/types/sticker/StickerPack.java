package jp.kurages.discord.types.sticker;

import jp.kurages.discord.types.Snowflake;

public class StickerPack {
	Snowflake id;
	Sticker[] stickers;
	String name;
	Snowflake skuId;
	Snowflake coverStickerId;
	String description;
	Snowflake bannerAssetId;
}
