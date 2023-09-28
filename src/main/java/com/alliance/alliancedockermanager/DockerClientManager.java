package com.alliance.alliancedockermanager;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.transport.DockerHttpClient;

public class DockerClientManager {
public DockerClient DockerConnect() {

    String docker_tls_verify = "http";
    String host = "tcp://localhost:2375";
    String registry_url = "qzhhhi/alliance-vsc-server:0.0.2";
    String api_version = "1.43";

    DefaultDockerClientConfig config = DefaultDockerClientConfig
            .createDefaultConfigBuilder()
            .withDockerTlsVerify(docker_tls_verify)
            .withDockerHost(host)
            .withApiVersion(api_version)
            .withRegistryUrl(registry_url)
            .build();

    DockerHttpClient httpClient = new

}
}
