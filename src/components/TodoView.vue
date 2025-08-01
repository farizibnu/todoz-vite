<template>
    
    <div class="grid grid-cols-2 gap-4">
        <div class="h-20 bg-blue-300 rounded-2xl flex items-center justify-center gap-4">
            <div class="pi pi-sync text-xl text-white rounded-full bg-blue-400 p-2"></div>
            <div>
                <p class="font-bold">On going</p>
                <p class="text-sm">24 Tasks</p>
            </div>
        </div>
        <div class="h-20 bg-yellow-300 rounded-2xl flex items-center justify-center gap-4">
            <div class="pi pi-clock text-xl text-white rounded-full bg-yellow-400 p-2"></div>
            <div>
                <p class="font-bold">In Process</p>
                <p class="text-sm">24 Tasks</p>
            </div>
        </div>
        <div class="h-20 bg-green-300 rounded-2xl flex items-center justify-center gap-4">
            <div class="pi pi-check-circle text-xl text-white rounded-full bg-green-400 p-2"></div>
            <div>
                <p class="font-bold">Complete</p>
                <p class="text-sm">0 Tasks</p>
            </div>
        </div>
        <div class="h-20 bg-red-300 rounded-2xl flex items-center justify-center gap-4">
            <div class="pi pi-exclamation-circle text-xl text-white rounded-full bg-red-400 p-2"></div>
            <div>
                <p class="font-bold">Canceled</p>
                <p class="text-sm">0 Tasks</p>
            </div>
        </div>

    </div>
</template>