package com.taobao.arthas.core.command.basic1000;

import com.taobao.arthas.core.shell.command.AnnotatedCommand;
import com.taobao.arthas.core.shell.command.CommandProcess;
import com.taobao.middleware.cli.annotations.Name;
import com.taobao.middleware.cli.annotations.Summary;
import com.taobao.text.util.RenderUtil;

@Name("cls")
@Summary("Clear the screen")
public class ClsCommand extends AnnotatedCommand {
    @Override
    public void process(CommandProcess process) {
        process.write(RenderUtil.cls()).write("\n");
        process.end();
    }
}
