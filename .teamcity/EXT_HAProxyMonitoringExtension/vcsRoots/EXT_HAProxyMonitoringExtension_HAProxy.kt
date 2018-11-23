package EXT_HAProxyMonitoringExtension.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_HAProxyMonitoringExtension_HAProxy : GitVcsRoot({
    uuid = "521650de-6f5e-40c8-af8f-6bb95ed04949"
    id = "EXT_HAProxyMonitoringExtension_HAProxy"
    name = "HAProxy"
    url = "git@github.com:satish-m/haproxy-monitoring-extension-ci.git"
    authMethod = uploadedKey {
        uploadedKey = "ssh-github"
        passphrase = "credentialsJSON:34a47f56-af6b-4133-85c0-70ad8057f7f2"
    }
})
