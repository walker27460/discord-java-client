package jp.kurages.discord.types;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 詳細はここ確認。
 * https://discord.com/developers/docs/reference#snowflakes
 */
@Getter
@ToString
@RequiredArgsConstructor
public class Snowflake {
	private static final long DISCORD_EPOCH = 1420070400000L;

	private final long value;

	/**
	 * 2015/1/1からの秒数
	 */
	public LocalDateTime getTime(){
		return LocalDateTime.ofInstant(
			Instant.ofEpochMilli((getValue() >> 22) + DISCORD_EPOCH),
			TimeZone.getDefault().toZoneId()
		);
	}

	public long getInternalWorkerId(){
		return (getValue() & 0x3E0000) >> 17;
	}

	public long getInternalProcessId(){
		return (getValue() & 0x1F000) >> 12;
	}

	public long getIncrement(){
		return getValue() & 0xFFF;
	}
}
