<template>
    <div id="repairPlan">
        <div class="header-top">抢修预案</div>
        <el-tabs v-model="activeName" @tab-click="handleClick">
            <el-tab-pane label="电力抢修预案" name="first">
                <el-form>
                    <el-form-item label="电力抢修预案">附件：
                        <div class="fujian">电力抢修预案</div>
                    </el-form-item>
                </el-form>
            </el-tab-pane>
            <el-tab-pane label="城市燃气管道事故应急抢修方案" name="second">
                <el-form>
                    <el-form-item label="城市燃气管道事故应急抢修方案">附件：
                        <div class="fujian">城市燃气管道事故应急抢修方案</div>
                    </el-form-item>
                </el-form>
            </el-tab-pane>
            <el-tab-pane label="管线抢修应急预案" name="third">
                <el-form>
                    <el-form-item label="管线抢修应急预案">附件：
                        <div class="fujian">管线抢修应急预案</div>
                    </el-form-item>

                </el-form>
            </el-tab-pane>
            <el-tab-pane label="供热抢修预案" name="fourth">
                <el-form>
                    <el-form-item label="供热抢修预案">附件：
                        <div class="fujian">供热抢修预案</div>
                    </el-form-item>

                </el-form>
            </el-tab-pane>
            <el-tab-pane label="电梯抢修应急预案" name="fifth">
                <el-form>
                    <el-form-item label="电梯抢修应急预案">附件：
                        <div class="fujian">电梯抢修应急预案</div>
                    </el-form-item>

                </el-form>
            </el-tab-pane>
        </el-tabs>
    </div>
</template>
<script>
    export default {
        data() {
            return {
                activeName: 'first'
            };
        },
        methods: {
            handleClick(tab, event) {
//                console.log(tab, event);
            }
        }
    }

</script>
<style>
    #repairPlan{  background: #1b1c21; padding: 5px 30px; font-family: Regular; }
    #repairPlan .header-top{ width: 100%; border-bottom: 1px solid rgb(121, 121, 123); padding: 15px 0; font-size: 16px;}
    #repairPlan .el-tabs{ width: 100%; position: relative;}
    #repairPlan .el-tabs__content{ display: inline-block;}
    #repairPlan .el-tabs__active-bar{ display: none; color: #20a0ff;}
    #repairPlan .el-tabs__header{ width: 27%; border-right: 1px solid rgb(121, 121, 123); display: inline-block; height: 870px;}
    #repairPlan .el-tabs__item{ display: block; padding: 0; color: #fff; width: 100%; border-bottom: 1px solid rgb(121, 121, 123);}
    #repairPlan .el-tabs__item.is-active{ color: #ef8041;}
    #repairPlan .el-tabs__item:hover{ color: #ef8041;}
    #repairPlan .el-tabs__header{ border-bottom: none;}
    #repairPlan .el-tabs__nav{ width: 100%;}
    #repairPlan .el-tabs__content{ position: absolute;/* border: 1px solid #FFA800;*/ width: 73%; height: 100%; padding: 0 3%;}
    #repairPlan .el-form-item__label{ width: 100%; float: none; text-align: center; color: #fff; font-size: 18px; font-weight: inherit; line-height: 40px;}
    #repairPlan .el-form-item{ color: #fff; font-size: 14px; }
    #repairPlan .el-form-item .el-form-item-con{ color: #ef8041; font-size: 14px; display: block; }
    #repairPlan .fujian{ color: #ef8041; font-size: 14px; display: block; margin-left: 30px; }
    #repairPlan .el-form-item__content{ position: absolute; bottom: 100px;}
</style>