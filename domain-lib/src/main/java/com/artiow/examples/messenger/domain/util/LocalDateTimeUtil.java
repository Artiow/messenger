package com.artiow.examples.messenger.domain.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

@UtilityClass
public final class LocalDateTimeUtil {

    public static Date mapToDate(LocalDateTime localDateTime) {
        return Objects.nonNull(localDateTime) ? Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()) : null;
    }

    public static LocalDateTime mapToLocalDateTime(Date date) {
        return Objects.nonNull(date) ? LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()) : null;
    }
}
