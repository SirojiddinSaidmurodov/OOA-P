package BehavioralPatterns.Visitor.MyOwnExample;

class Visitor {

    public void export(CompositeGraphic compositeGraphic) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
        for (Graphic graphic : compositeGraphic.mChildGraphics) {
            stringBuilder.append(graphic.accept(this));
        }
        System.out.println(stringBuilder.toString());
    }

    public String visit(Figure figure) {
        return "<figure>\n" +
                "    <name>" + figure.name + "</name>\n" +
                "</figure>";
    }

    public String visit(CompositeGraphic cg) {
        return "<composite_graphic>" + "\n" +
                _visitCompositeGraphic(cg) +
                "</composite_graphic>\n";
    }

    private String _visitCompositeGraphic(CompositeGraphic cg) {
        StringBuilder sb = new StringBuilder();
        for (Graphic shape : cg.mChildGraphics) {
            String obj = shape.accept(this);
            obj = "     " + obj.replace("\n", "\n     ") + "\n";
            sb.append(obj);
        }
        return sb.toString();
    }
}
