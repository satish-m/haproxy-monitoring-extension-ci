package EXT_HaproxyMonitoringExtensionCi.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension : GitVcsRoot({
    uuid = "52d0e47f-a0a8-47fd-8338-03d1fa29c66d"
    id = "EXT_HaproxyMonitoringExtensionCi_HttpsGithubComSatishMHaproxyMonitoringExtension"
    name = "https://github.com/satish-m/haproxy-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/satish-m/haproxy-monitoring-extension-ci"
    authMethod = password {
        userName = "satish-m"
        password = "credentialsJSON:0c8cf62d-6a9f-4b6c-8d02-f58defe307b3"
    }
})
