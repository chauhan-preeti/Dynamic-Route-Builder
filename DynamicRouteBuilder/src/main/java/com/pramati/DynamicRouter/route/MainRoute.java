package com.pramati.DynamicRouter.route;

import org.apache.camel.builder.RouteBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.pramati.DynamicRouter.bean.GlobalProcessorBean;


@Configuration
public class MainRoute extends RouteBuilder {

	@Autowired
	private GlobalProcessorBean globalProcessorBean;

	@Override
	public void configure() throws Exception {
		rest("getMessage").post().route().bean(globalProcessorBean);
		}
}
