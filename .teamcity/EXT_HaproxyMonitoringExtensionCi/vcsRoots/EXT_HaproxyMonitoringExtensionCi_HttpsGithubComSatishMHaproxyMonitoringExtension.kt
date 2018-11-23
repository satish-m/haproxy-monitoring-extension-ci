package EXT_HaproxyMonitoringExtensionCi.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension : GitVcsRoot({
    uuid = "52d0e47f-a0a8-47fd-8338-03d1fa29c66d"
    id = "EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension"
    name = "https://github.com/satish-m/haproxy-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/haproxy-monitoring-extension-ci"
    authMethod = uploadedKey {
        uploadedKey = "ssh-github"
        passphrase = "credentialsJSON:34a47f56-af6b-4133-85c0-70ad8057f7f2"
    }
})
