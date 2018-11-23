package EXT_HaproxyMonitoringExtensionCi.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_HAProxyMonitoringExtension : GitVcsRoot({
    uuid = "C0B84A34-AD9A-4C19-A2C7-1B560A9DC2DC"
    id = "EXT_HAProxyMonitoringExtension"
    name = "HAProxy"
    url = "git@github.com:satish-m/haproxy-monitoring-extension-ci.git"
    authMethod = uploadedKey {
        uploadedKey = "ssh-github"
        passphrase = "credentialsJSON:34a47f56-af6b-4133-85c0-70ad8057f7f2"
    }
})
