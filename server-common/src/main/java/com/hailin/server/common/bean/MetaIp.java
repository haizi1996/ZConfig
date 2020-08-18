package com.hailin.server.common.bean;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MetaIp {

    private final ConfigMeta meta;
    private final String ip;

    public MetaIp(ConfigMeta meta, String ip) {
        this.meta = meta;
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetaIp metaIp = (MetaIp) o;
        if (meta != null ? !meta.equals(metaIp.meta) : metaIp.meta != null) return false;
        return ip != null ? ip.equals(metaIp.ip) : metaIp.ip == null;
    }

    @Override
    public int hashCode() {
        int result = meta != null ? meta.hashCode() : 0;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        return result;
    }
}
