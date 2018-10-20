$(function() {
    setInterval(function() {
        var hour = new Date().getHours();
        var minute = new Date().getMinutes();
        var second = new Date().getSeconds();
        var today = new Date().getDay();
        var week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");

        if (hour < 10) {
            hour = "0" + hour;
        }

        if (minute < 10) {
            minute = "0" + minute;
        }

        if (second < 10) {
            second = "0" + second;
        }

        $("#span_time").text(hour + "时" + minute + "分" + second + "秒" + " " + week[today]);
    });

    $("#modal_create").on("show.bs.modal", function() {
        $("#input_power_score").next().children().val($("#input_power_score").val());
        $("#input_spirit_score").next().children().val($("#input_spirit_score").val());
        $("#input_agility_score").next().children().val($("#input_agility_score").val());
        $("#input_endurance_score").next().children().val($("#input_endurance_score").val());
        $("#input_defense_score").next().children().val($("#input_defense_score").val());
        $("#input_toughness_score").next().children().val($("#input_toughness_score").val());

        // EChart 雷达图 start
        echarts.init($("#div_right")[0], "dark").setOption({
            tooltip: {
                trigger: "none"
            },

            radar: [{
                indicator: [{
                    text: "力量",
                    max: 100
                }, {
                    text: "精神",
                    max: 100
                }, {
                    text: "敏捷",
                    max: 100
                }, {
                    text: "耐力",
                    max: 100
                }, {
                    text: "防御",
                    max: 100
                }, {
                    text: "韧性",
                    max: 100
                }],

                center: ["50%", "50%"]
            }],

            series: [{
                type: "radar",

                tooltip: {
                    trigger: "item"
                },

                itemStyle: {
                    normal: {
                        areaStyle: {
                            type: "default"
                        }
                    }
                },

                data: [{
                    value: [
                        $("#input_power_score").val(), 
                        $("#input_spirit_score").val(), 
                        $("#input_agility_score").val(), 
                        $("#input_endurance_score").val(), 
                        $("#input_defense_score").val(), 
                        $("#input_toughness_score").val()
                    ],

                    name: "Legend"
                }]
            }]
        });
        // EChart 雷达图 end
    });

    $("#modal_create").on("hidden.bs.modal", function () {
        $("#input_name").val("");
        $("#input_designation").val("");
        $("#select_element").val("金");
        $("#input_ability").val("");
        $("#input_belong_to").val("");
        $("#input_power_score").val("50");
        $("#input_spirit_score").val("50");
        $("#input_agility_score").val("50");
        $("#input_endurance_score").val("50");
        $("#input_defense_score").val("50");
        $("#input_toughness_score").val("50");

        // EChart 雷达图 start
        echarts.init($("#div_right")[0], "dark").setOption({
            tooltip: {
                trigger: "none"
            },

            radar: [{
                indicator: [{
                    text: "力量",
                    max: 100
                }, {
                    text: "精神",
                    max: 100
                }, {
                    text: "敏捷",
                    max: 100
                }, {
                    text: "耐力",
                    max: 100
                }, {
                    text: "防御",
                    max: 100
                }, {
                    text: "韧性",
                    max: 100
                }],

                center: ["50%", "50%"]
            }],

            series: [{
                type: "radar",

                tooltip: {
                    trigger: "item"
                },

                itemStyle: {
                    normal: {
                        areaStyle: {
                            type: "default"
                        }
                    }
                },

                data: [{
                    value: [
                        $("#input_power_score").val(), 
                        $("#input_spirit_score").val(), 
                        $("#input_agility_score").val(), 
                        $("#input_endurance_score").val(), 
                        $("#input_defense_score").val(), 
                        $("#input_toughness_score").val()
                    ],

                    name: "Legend"
                }]
            }]
        });
        // EChart 雷达图 end
    });

    $("#input_name, #input_designation, #input_ability, #input_belong_to").click(function() {
        $(this).removeClass("input-basic");
    });

    $("#span_picture").click(function() {
        $("#input_picture").click();
    });

    $("input[type='range']").on("input propertychange", function() {
        $(this).next().children().val($(this).val());

        // EChart 雷达图 start
        echarts.init($("#div_right")[0], "dark").setOption({
            tooltip: {
                trigger: "none"
            },

            radar: [{
                indicator: [{
                    text: "力量",
                    max: 100
                }, {
                    text: "精神",
                    max: 100
                }, {
                    text: "敏捷",
                    max: 100
                }, {
                    text: "耐力",
                    max: 100
                }, {
                    text: "防御",
                    max: 100
                }, {
                    text: "韧性",
                    max: 100
                }],

                center: ["50%", "50%"]
            }],

            series: [{
                type: "radar",

                tooltip: {
                    trigger: "item"
                },

                itemStyle: {
                    normal: {
                        areaStyle: {
                            type: "default"
                        }
                    }
                },

                data: [{
                    value: [
                        $("#input_power_score").val(), 
                        $("#input_spirit_score").val(), 
                        $("#input_agility_score").val(), 
                        $("#input_endurance_score").val(), 
                        $("#input_defense_score").val(), 
                        $("#input_toughness_score").val()
                    ],

                    name: "Legend"
                }]
            }]
        });
        // EChart 雷达图 end
    });

    $("input[type='range']").next().children().dblclick(function() {
        $(this).removeAttr("readOnly");
    });

    $("input[type='range']").next().children().on("input propertychange", function() {
        $(this).parent().prev().val($(this).val());

        // EChart 雷达图 start
        echarts.init($("#div_right")[0], "dark").setOption({
            tooltip: {
                trigger: "none"
            },

            radar: [{
                indicator: [{
                    text: "力量",
                    max: 100
                }, {
                    text: "精神",
                    max: 100
                }, {
                    text: "敏捷",
                    max: 100
                }, {
                    text: "耐力",
                    max: 100
                }, {
                    text: "防御",
                    max: 100
                }, {
                    text: "韧性",
                    max: 100
                }],

                center: ["50%", "50%"]
            }],

            series: [{
                type: "radar",

                tooltip: {
                    trigger: "item"
                },

                itemStyle: {
                    normal: {
                        areaStyle: {
                            type: "default"
                        }
                    }
                },

                data: [{
                    value: [
                        $("#input_power_score").val(), 
                        $("#input_spirit_score").val(), 
                        $("#input_agility_score").val(), 
                        $("#input_endurance_score").val(), 
                        $("#input_defense_score").val(), 
                        $("#input_toughness_score").val()
                    ],

                    name: "Legend"
                }]
            }]
        });
        // EChart 雷达图 end
    });

    $("input[type='range']").next().mouseleave(function() {
        if (!$(this).children().val()) {
            $(this).children().val($(this).prev().val());
        }

        $(this).children().attr("readOnly", "readOnly");
    });

    $("#input_create").click(function() {
        var isSubmit = true;

        if (!$("#input_name").val().trim()) {
            isSubmit = false;
            $("#input_name").addClass("input-basic");
        }

        if (!$("#input_designation").val().trim()) {
            isSubmit = false;
            $("#input_designation").addClass("input-basic");
        }

        if (!$("#input_ability").val().trim()) {
            isSubmit = false;
            $("#input_ability").addClass("input-basic");
        }

        if (!$("#input_belong_to").val().trim()) {
            isSubmit = false;
            $("#input_belong_to").addClass("input-basic");
        }

        if (isSubmit) {
            $.ajax({
                url: "/legend/create",
                type: "POST",
                data: new FormData($("#form_legend")[0]),
                processData: false,
                contentType: false,

                success: function (data) {
                    if ("success" == data) {
                        alert("新增成功！");
                        window.location.reload();
                    } else {
                        alert("新增失败！");
                    }
                }
            });
        }
    });
});
