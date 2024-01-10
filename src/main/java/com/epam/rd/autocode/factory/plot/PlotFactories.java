package com.epam.rd.autocode.factory.plot;

class PlotFactories {

    public PlotFactory classicDisneyPlotFactory(Character hero, Character beloved, Character villain) {
        return new PlotFactory() {
            @Override
            public Plot plot() {
                return new ClassicDisneyPlot(hero, beloved, villain);
            }
        };
    }

    public PlotFactory contemporaryDisneyPlotFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        return new PlotFactory() {
            @Override
            public Plot plot() {
                return new ContemporaryDisneyPlot(hero, epicCrisis, funnyFriend);
            }
        };
    }

    public PlotFactory marvelPlotFactory(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        return new PlotFactory() {
            @Override
            public Plot plot() {
                return new MarvelPlot(heroes, epicCrisis, villain);
            }
        };
    }
}
