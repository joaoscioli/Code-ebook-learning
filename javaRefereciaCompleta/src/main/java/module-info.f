//// Definição do módulo para o módulo de funções.
//module appfuncs {
//    // Exporta o pacote appfuncs.simplefuncs.
//    exports capitulo16.appsrc.appfuncs.appfuncs.simplefuncs;
//}

//// Definição do módulo para o módulo principal do aplicativo.
//module appstart {
// Requer o módulo appfuncs.
//  require appfunc;
//}

//module userfuncs {
//    exports capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs;
//}

//module userfuncsimp {
//    provides capitulo16.appsrc.userfuncs.userfuncs.binaryfuncs.BinFuncProvider with
//            capitulo16.appsrc.userfuncsimp.userfuncsimp.binaryfuncsimp.AbsPlusProvider,
//            capitulo16.appsrc.userfuncsimp.userfuncsimp.binaryfuncsimp.AbsMinusProvider;
//}

// Definição do módulo para o módulo principal do aplicativo.
// Agora usa BinFuncProvider.
//module appstart {
//    // Requer os módulos appfuncs e userfuncs.
//    requires appfuncs;
//    requires userfuncs;
//    // appstart agora usa BinFuncProvider.
//    uses userfuncs.binaryfuncs.BinFuncProvider;
//}