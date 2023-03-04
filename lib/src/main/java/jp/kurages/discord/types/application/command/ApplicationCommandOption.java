package jp.kurages.discord.types.application.command;

import jp.kurages.discord.types.Locales;
import jp.kurages.discord.types.channel.ChannelTypes;

public class ApplicationCommandOption {
	ApplicationCommandOptionType type;
	String name;
	Locales nameLocalizations;
	String description;
	Locales descriptionLocalizations;
	Boolean required;
	ApplicationCommandOptionChoice[] choices;
	ApplicationCommandOption[] options;
	ChannelTypes[] channelTypes;
	String minValue;
	String maxValue;
	String minlength;
	String maxlength;
	Boolean autocomplete;
}
