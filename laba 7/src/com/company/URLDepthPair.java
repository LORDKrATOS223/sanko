package com.company;

import java.net.URLConnection;
import java.util.Objects;

public class URLDepthPair {

    private String m_Url;
    private int m_Depth;

    public URLDepthPair(String host, int depth) {
        m_Url = host;
        m_Depth = depth;
    }

    public String getURL() {
        return m_Url;
    }

    public int getDepth() {
        return m_Depth;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof URLDepthPair) {
            URLDepthPair o = (URLDepthPair)obj;
            return this.m_Url.equals(o.getURL());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
}