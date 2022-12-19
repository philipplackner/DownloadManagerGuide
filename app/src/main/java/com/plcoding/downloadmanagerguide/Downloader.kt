package com.plcoding.downloadmanagerguide

interface Downloader {
    fun downloadFile(url: String): Long
}